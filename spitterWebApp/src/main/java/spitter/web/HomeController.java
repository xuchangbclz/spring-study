/**  
* Title: HomeController.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年7月17日  
* @version 1.0  
*/  
package spitter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**  
* Title: HomeController
* Description: 
* @author xuchang 
* @date 2018年7月17日  
*/

@Controller
public class HomeController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String toHome() {
		return "home";
	}
	
	
}
