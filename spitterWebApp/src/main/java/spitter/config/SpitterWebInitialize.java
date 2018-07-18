/**  
* Title: SpitterConfig.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年7月17日  
* @version 1.0  
*/ 
package spitter.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**  
* Title: SpitterConfig
* Description: 创建Web初始化类(替代web.xml)
* @author xuchang 
* @date 2018年7月17日  
*/

public class SpitterWebInitialize extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	/**
	 * 加载root配置类  对应applicationContext.xml
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {RootConfig.class};
	}
	
	/**
	 * 加载web配置类  对应springmvc.xml
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
