/**  
* Title: DoingImpl.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月7日  
* @version 1.0  
*/  
package test;

import org.springframework.stereotype.Component;

/**  
* Title: DoingImpl
* Description: 
* @author xuchang 
* @date 2018年6月7日  
*/
@Component
public class DoingImpl implements PersonDothing {

	@Override
	public void eating(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+" Eating...");

	}

}
