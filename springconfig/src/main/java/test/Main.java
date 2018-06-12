/**  
* Title: Main.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月8日  
* @version 1.0  
*/  
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import springconfig.PersonConfigure;

/**  
* Title: Main
* Description: 
* @author xuchang 
* @date 2018年6月8日  
*/

public class Main {
	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(PersonConfigure.class);
		Person p=(Person)ac.getBean("person");
		p.setName("zhangsan");
		p.doThing();
		
	}
	
}
