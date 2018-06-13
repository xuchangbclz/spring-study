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
  
  *通过ConditionContext， 我们可以做到如下几点：
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
  *AnnotatedTypeMetadata则能够让我们检查带有@Bean注解的方
  法上还有什么其他的注解。
