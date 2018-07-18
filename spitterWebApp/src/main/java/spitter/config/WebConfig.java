/**  
* Title: WebConfig.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年7月17日  
* @version 1.0  
*/  
package spitter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**  
* Title: WebConfig
* Description: springmvc  dispatchServlet加载的web上下文
* @author xuchang 
* @date 2018年7月17日  
*/

@EnableWebMvc
@Configuration
@ComponentScan("spitter.web")
public class WebConfig extends WebMvcConfigurerAdapter {

	/**
	 * 
	 * Title: viewResolver 
	 * Description:  添加一个视图解析器
	 * @return
	 */
	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		vr.setExposeContextBeansAsAttributes(true);    // 是否导出环境的Bean作为属性,使得可以在JSP页面中通过${ }访问容器中的bean
		return vr;
	}
	
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		configurer.enable();  //将静态资源转发到默认的servlet处理
	}
	
	
	
}
