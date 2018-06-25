/**  
* Title: App.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月21日  
* @version 1.0  
*/  
package aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.execution.Robot;
import aspect.execution.Working;

/**  
* Title: App
* Description: @EnableAspectJAutoProxy开启自动代理功能
* @author xuchang 
* @date 2018年6月21日  
*/
@Configuration
@ComponentScan("aspect")
@EnableAspectJAutoProxy
public class App {
	
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext app=new AnnotationConfigApplicationContext(App.class);
		Working w=app.getBean(Working.class);
		w.perform();
		w.robotOutFileNum(5);
		w.robotOutFileNum(6);
		
	}
	
	/**
	 * 
	 * Title: getRobot 
	 * Description:  注入切面Bean
	 * @return
	 */
	@Bean
	public Robot getRobot() {
		return new Robot();
	}
	
	
}
