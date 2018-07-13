/**  
* Title: DTielineUsb.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年7月12日  
* @version 1.0  
*/  
package javaproxy.dynamic;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**  
* Title: ProxyFactory
* Description: 动态代理  ,代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
* @author xuchang 
* @date 2018年7月12日  
*/
public class ProxyFactory {
	
	private Object target;
	
	public ProxyFactory(Object object) {
		this.target=object;
		
	}
	/**
	 * 
	 * Title: getProxyIntance 
	 * Description:  1.ClassLoader loader 类加载器  
	 * 				 2.Class<?>[] interfaces 目标对象的接口类型
	 * 				 3.通过 InvocationHandler 会把目标对象、目标对象的方法、方法作为参数传入
	 * @return 代理对象Object
	 */
	public Object getProxyIntance() {
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), 
				(Object proxy,Method method,Object[] args)->{
					
					System.out.println("开始事务");
					System.out.println(proxy.getClass().getName());   //proxy对象
		            //执行目标对象方法
					System.out.println("link tieline ...");
		            Object returnValue = method.invoke(target, args);
		            System.out.println("提交事务");
		            return returnValue;
				});
		
	}
	
	
	
}
