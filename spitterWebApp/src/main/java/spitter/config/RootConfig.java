/**  
* Title: RootConfig.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年7月17日  
* @version 1.0  
*/  
package spitter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**  
* Title: RootConfig
* Description: ContextLoaderListener是ServletContextListener实现类,这里的配置为了ContextLoaderListener加载root上下文
* @author xuchang 
* @date 2018年7月17日  
*/

@Configuration
//传统Web启动加载顺序是web.xml->root  applicationContext.xml ->web  springmvc.xml
//也就是说Spring容器会先加载ServletContextListener产生的父容器,再加载DispatchServle创建的子容器，避免加载两次覆盖
//会出现比如事务不生效，用切面配置事务在root里面 注入service类具有事务性，DispatchServle又加载一遍没有事务性的service覆盖原来的。
//可以加入excludeFilters和includeFilters避免
@ComponentScan(basePackages= {"spitter"},excludeFilters= {
		@Filter(type=FilterType.ANNOTATION,value=EnableWebMvc.class),
		@Filter(type=FilterType.ANNOTATION,value=Controller.class)
})
public class RootConfig {
	
	
	
}
