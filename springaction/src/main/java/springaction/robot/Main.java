/**  
* Title: Main.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月5日  
* @version 1.0  
*/  
package springaction.robot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import springaction.configure.RobotConfiguration;

/**  
* Title: Main
* Description: 
* @author xuchang 
* @date 2018年6月5日  
*/
public class Main {
	
	
	
	public static void main(String[] args) {
		//基于spring xml加载配置,从类路径下的一个或多个XML配置文件中加载上下文定义， 把应用上下文的定义文件作为类资源。
//		ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:robotconfiguraction.xml");
		
		//基于spring bean加载配置,从一个或多个基于Java的配置类中加载Spring应用上下文
//		ApplicationContext ac=new AnnotationConfigApplicationContext(RobotConfiguration.class);
		
		//基于文件系统加载配置上下文
		ApplicationContext ac=new FileSystemXmlApplicationContext("D:\\workspace\\springaction\\src\\main\\resources\\robotconfiguraction.xml");
		Action a=ac.getBean(Action.class);
		RobotAction r=new RobotAction(a);
		r.excu();
		
	}
}
