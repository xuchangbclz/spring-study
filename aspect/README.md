### Spring Aspect
1. Advice(何时执行)
    Spring切面可以应用5种类型的通知：
    * 前置通知（Before）：在目标方法被调用之前调用通知功能;
    * 后置通知（After）：在目标方法完成之后调用通知， 此时不会关
      心方法的输出是什么；
    * 返回通知（After-returning）：在目标方法成功执行之后调用通
      知；
    * 异常通知（After-throwing）：在目标方法抛出异常后调用通知；
    * 环绕通知（Around）： 通知包裹了被通知的方法， 在被通知的方
      法调用之前和调用之后执行自定义的行为。
2. Joinpoint(哪个范围执行)
3. Poincut(何地)
4. Aspect(通知和切点共同组成)
5. Introduction（引入）
6. Weaving(织入)
```
 execution(modifiers-pattern? ret-type-pattern declaring-type-pattern? name-pattern(param-pattern)  throws-pattern?)
　　　　ret-type-pattern,name-pattern(param-pattern)是必须的.
　　　　ret-type-pattern:标识方法的返回值，需要使用全路径的类名如java.lang.String,也可以为*表示任何返回值；
　　　　name-pattern:指定方法名,*代表所有,例如set*,代表以set开头的所有方法.
　　　　param-pattern:指定方法参数(声明的类型),(..)代表所有参数,(*)代表一个参数,(*,String)代表第一个参数为任何值,第二个为String类型.
```
表达式例子如下：

任意公共方法的执行：
execution(public * *(..))
任何一个以“set”开始的方法的执行：
execution(* set*(..))
AccountService 接口的任意方法的执行：
execution(* com.xyz.service.AccountService.*(..))
定义在service包里的任意方法的执行：
execution(* com.xyz.service.*.*(..))
定义在service包和所有子包里的任意类的任意方法的执行：
execution(* com.xyz.service..*.*(..))
定义在pointcutexp包和所有子包里的JoinPointObjP2类的任意方法的执行：
execution(* com.test.spring.aop.pointcutexp..JoinPointObjP2.*(..))")

在多个表达式之间使用 ||,or表示 或，使用 &&,and表示 与，！表示 非.例如：
```
(execution(* com.ccboy.dao..*.find*(..))) or (execution(* com.ccboy.dao..*.query*(..)))
```
