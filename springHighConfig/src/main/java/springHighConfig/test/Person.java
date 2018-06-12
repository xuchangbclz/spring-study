/**  
* Title: Person.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月8日  
* @version 1.0  
*/  
package springHighConfig.test;

/**  
* Title: Person
* Description: 
* @author xuchang 
* @date 2018年6月8日  
*/
public class Person {
	
	private String name;
	
	public  Person(String name) {
		this.name=name;
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
