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
