### Spring高级装配
1. 环境与profile  @profile注解的使用
  解决问题：在开发软件的时候， 有一个很大的挑战就是将应用程序从一个环境迁
	移到另外一个环境。 开发阶段中， 某些环境相关做法可能并不适合迁
	移到生产环境中， 甚至即便迁移过去也无法正常工作。 数据库配置、
	加密算法以及与外部系统的集成是跨环境部署时会发生变化
  
2. 条件化的bean  @Conditional的使用
  解决问题：假设你希望一个或多个bean只有在应用的类路径下包含特定的库时才
  创建。 或者我们希望某个bean只有当另外某个特定的bean也声明了之
  后才会创建。 我们还可能要求只有某个特定的环境变量设置之后， 才
  会创建某个bean
  @Conditional将会通过Condition接口进行条件对比,接口有两个参数ConditionContext,AnnotatedTypeMetadata
  
	  * 通过ConditionContext， 我们可以做到如下几点：
	  借助getRegistry()返回的BeanDefinitionRegistry检查
	  bean定义；
	  借助getBeanFactory()返回的
	  ConfigurableListableBeanFactory检查bean是否存在，
	  甚至探查bean的属性；
	  借助getEnvironment()返回的Environment检查环境变量
	  是否存在以及它的值是什么；
	  读取并探查getResourceLoader()返回的ResourceLoader
	  所加载的资源；
	  借助getClassLoader()返回的ClassLoader加载并检查类
	  是否存在。
	  * AnnotatedTypeMetadata则能够让我们检查带有@Bean注解的方
	  法上还有什么其他的注解。
  @profile的实现也是基于Condition接口实现，通过AnnotatedTypeMetadata读取注解的value判断

3. 自动装配的歧义性  @Primary和@Qualifier
  解决问题：当确实发生歧义性的时候， Spring提供了多种可选方案来解决
  这样的问题。 你可以将可选bean中的某一个设为首选（primary） 的
 bean， 或者使用限定符（qualifier） 来帮助Spring将可选的bean的范围
  缩小到只有一个bean。
	  * 通过@Primary设置首选， 但@Primary无法将可选方案的范围限定到
	   唯一一个无歧义性的选项中。
	  * 通过@Qualifier 与之相反， Spring的限定符能够在所有可选的bean上进行缩小范围的
	  操作， 最终能够达到只有一个bean满足所规定的限制条件。 如果将所
	  有的限定符都用上后依然存在歧义性， 那么你可以继续使用更多的限
	  定符@Qualifier来缩小选择范围。
4. bean的作用域
   在默认情况下， Spring应用上下文中所有bean都是作为以单例
（singleton） 的形式创建的。
   有时候， 可能会发现， 你所使用的类是易变的（mutable） ， 它们会保
持一些状态， 因此重用是不安全的。在这种情况下， 将class声明为单
例的bean就不是什么好主意了， 
Spring定义了多种作用域， 可以基于这些作用域创建bean， 包括：
* 单例（Singleton） ： 在整个应用中， 只创建bean的一个实例。
* 原型（Prototype） ： 每次注入或者通过Spring应用上下文获取的
时候， 都会创建一个新的bean实例。
* 会话（Session） ： 在Web应用中， 为每个会话创建一个bean实
例。
* 请求（Rquest） ： 在Web应用中， 为每个请求创建一个bean实
例。
	1. 单例和原型
	```
	@Component
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public class Test {...}

	或者在方法中
	//ConfigurableBeanFactory.SCOPE_PROTOTYPE或者直接写"prototype",前者是spring定义的原型作用域。
	//定义了两个作用域ConfigurableBeanFactory.SCOPE_SINGLETON和ConfigurableBeanFactory.SCOPE_PROTOTYPE
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Test test() {
		return new Test();
	}

	```
	
	2. 使用会话和请求作用域
	在Web应用中， 如果能够实例化在会话和请求范围内共享的bean， 那
	将是非常有价值的事情。 例如， 在典型的电子商务应用中， 可能会有
	一个bean代表用户的购物车。 就购物车bean来说， 会话作用域是最为合适的，
	```
	//WebApplicationContext.SCOPE_SESSION="session"
	//"session"这会告诉Spring为Web应用中的每个会话创建一个ShoppingCart。
	@Component
	@Scope(
	    value=WebApplicationContext.SCOPE_SESSION,
	    proxyMode=ScopedProxyMode.INTERFACES)
	public ShoppingCart cart() {...}


	@Component
	public class StoreService{
		@Autowired
		private ShoppingCart cart

	}
	```
	proxyMode解决的问题:
	有如下场景:因为StoreService是一个单例的bean， 会在Spring应用上下文加载的时候创建。
	当它创建的时候， Spring会试图将ShoppingCart bean注入，
	但是ShoppingCart bean是会话作用域的， 此时并不存在。 直到某个用户进入系统， 创建了会话之后， 才会出现ShoppingCart实例。
	系统中将会有多个ShoppingCart实例： 每个用户一个。购物车随着用户的变化而变化而不是固定的;

	因此，在这里Spring并不会将实际的ShoppingCart bean注入到StoreService中，Spring会注入一个到ShoppingCart bean的代理，
	这个代理会暴露与ShoppingCart相同的方法， 所以StoreService会认为它就是一个购物车。 但是， 当StoreService调用ShoppingCart的方法时， 
	代理会对其进行懒解析并将调用委托给会话作用域内真正的ShoppingCart bean。
	如配置所示， proxyMode属性被设置成了ScopedProxyMode.INTERFACES， 这表明这个代理要实现ShoppingCart接口， 并将调用委托给实现bean。
	接口代理是最理想的方式，但如果ShoppingCart是具体的类，此时， 它必须使用CGLib来生成基于类的代理。
	要将proxyMode属性设置为ScopedProxyMode.TARGET_CLASS， 以此来表明要以生成目标类扩展的方式创建代理。
