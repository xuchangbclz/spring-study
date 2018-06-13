/**  
* Title: Main.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月8日  
* @version 1.0  
*/  
package springHighConfig.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import springHighConfig.config.ConditionBeanConfig;
import springHighConfig.config.Config;

/**  
* Title: Main
* Description: 
* @author xuchang 
* @date 2018年6月8日  
*/
@Configurable
@Import(value= {Config.class,ConditionBeanConfig.class})
public class Main {
		
	
	public static void main(String[] args) {
		System.setProperty("spring.profiles.active","dev");   //设置spring.profiles.active  或者设置默认参数spring.profiles.default
		ConfigurableApplicationContext    ac=new AnnotationConfigApplicationContext(Main.class);
		System.out.println(ac.getEnvironment().getActiveProfiles()[0]);
		System.out.println(ac.getBean(Person.class).toString());
	}
	
}
