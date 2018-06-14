/**  
* Title: App.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月14日  
* @version 1.0  
*/  
package com.bclz;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.bclz.domain.Website;

/**  
* Title: App
* Description: 
* @author xuchang 
* @date 2018年6月14日  
*/

@Configurable
@ComponentScan(basePackages="com.bclz")
@PropertySource("classpath:web.properties")
public class PropertyHoldApp {
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext ac=new AnnotationConfigApplicationContext(PropertyHoldApp.class);
		Environment env=ac.getEnvironment();
		System.out.println(env.getProperty("wbsite.URL"));
		//若无此属性，会取默认值
		System.out.println(env.getProperty("asassasasasasasa", "默认值"));
		//指定文件值里的类型
		System.out.println(env.getProperty("wbsite.requNum", Integer.class));
		//指定文件值里的类型，若无此属性，会取默认值
		System.out.println(env.getProperty("asasasasasa", Integer.class,2));
		System.out.println((ac.getBean(Website.class)).getURL());
		System.out.println((ac.getBean(Website.class)).getSpEl());
	}
	
	//开启使用占位符配置
	@Bean
	public PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}
