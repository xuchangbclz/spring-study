/**  
* Title: RobotConfiguration.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月5日  
* @version 1.0  
*/  
package springaction.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springaction.robot.Action;
import springaction.robot.CleanAction;

/**  
* Title: RobotConfiguration
* Description: 
* @author xuchang 
* @date 2018年6月5日  
*/

@Configuration
public class RobotConfiguration {
	
	
	
	@Bean
	public Action getStream() {
		
		return new CleanAction(System.out);
	}
	
	
}
