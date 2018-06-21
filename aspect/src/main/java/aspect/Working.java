/**  
* Title: Performance.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月21日  
* @version 1.0  
*/  
package aspect;

import org.springframework.stereotype.Component;

/**  
* Title: Working
* Description: 
* @author xuchang 
* @date 2018年6月21日  
*/

@Component
public class Working {
	
	
	public void perform() throws  Exception{
		
		System.out.println("开始工作...");
		/*throw new Exception();*/
	}
	
}
