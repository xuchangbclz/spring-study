/**  
* Title: DTielineUsb.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年7月12日  
* @version 1.0  
*/  
package javaproxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**  
* Title: ProxyFactory
* Description: Cglib动态代理,不需要目标对象实现接口,需要引入Cglib包(这里直接引用的Spring包)
* @author xuchang 
* @date 2018年7月12日  
*/
public class ProxyFactory implements MethodInterceptor {
	
	
	private Object target;
	
	public ProxyFactory(Object object) {
		this.target=object;
		
	}
	
	public Object getProxyIntance() {
		
		Enhancer h=new Enhancer();
		h.setSuperclass(target.getClass());
		//设置CallBack接口的实例,即MethodInterceptor的实现
		h.setCallback( this);
		return h.create();
	}
	
	

	@Override
	public Object intercept(Object paramObject, Method paramMethod, Object[] paramArrayOfObject,
			MethodProxy paramMethodProxy) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("开始事务...");
	    //执行目标对象的方法
		System.out.println("link tieline ...");
        Object returnValue = paramMethod.invoke(target, paramArrayOfObject);
        System.out.println("提交事务...");
        return returnValue;
	}
	
	
	
}
