/**  
* Title: Performance.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月21日  
* @version 1.0  
*/  
package aspect.execution;

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
	
	/**
	 * 
	 * Title: robotOutFileNum 
	 * Description:机器人传递文件  
	 * @param count
	 */
	public void robotOutFileNum(int count) {
		
		System.out.println("传递"+count+"个文件");
	}
	
}
