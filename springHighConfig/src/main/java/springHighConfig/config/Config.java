/**  
* Title: Config.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月8日  
* @version 1.0  
*/  
package springHighConfig.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

import springHighConfig.test.Person;

/**  
* Title: Config
* Description: 
* @author xuchang 
* @date 2018年6月8日  
*/

public class Config {
	
	@Bean
	@Profile("dev")
	public Person printStream_dev() {
		
		return new Person("我是开发1");
	}
	
	@Bean
	@Profile("pro")
	public Person printStream2_pro() {
		
		return new Person("我是开发");
	}
	
	
}
