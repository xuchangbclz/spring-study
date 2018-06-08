### Spring Bean生命周期
在bean准备就绪之前， bean工厂执行了若干启动步骤：
1. Spring对bean进行实例化；
2. Spring将值和bean的引用注入到bean对应的属性中；
3. 如果bean实现了BeanNameAware接口， Spring将bean的ID传递给
setBean-Name()方法；
4. 如果bean实现了BeanFactoryAware接口， Spring将调
用setBeanFactory()方法， 将BeanFactory容器实例传入；
5. 如果bean实现了ApplicationContextAware接口， Spring将调
用setApplicationContext()方法， 将bean所在的应用上下文的
引用传入进来；
6. 如果bean实现了BeanPostProcessor接口， Spring将调用它们
的post-ProcessBeforeInitialization()方法；
7. 如果bean实现了InitializingBean接口， Spring将调用它们的
after-PropertiesSet()方法。 类似地， 如果bean使用initmethod声明了初始化方法， 该方法也会被调用；
8. 如果bean实现了BeanPostProcessor接口， Spring将调用它们
的post-ProcessAfterInitialization()方法；
9. 此时， bean已经准备就绪， 可以被应用程序使用了， 它们将一直
驻留在应用上下文中， 直到该应用上下文被销毁；
10. 如果bean实现了DisposableBean接口， Spring将调用它的
destroy()接口方法。 同样， 如果bean使用destroy-method声明
了销毁方法， 该方法也会被调用。
