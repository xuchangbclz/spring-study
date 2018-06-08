/**  
* Title: Person.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月7日  
* @version 1.0  
*/  
package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**  
* Title: Person
* Description: 
* @author xuchang 
* @date 2018年6月7日  
*/

@Component
public class Person {
	
	@Autowired
	private PersonDothing p;
	
	private String name;
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public void doThing() {
		p.eating(name);
		
	}
	
	
}
