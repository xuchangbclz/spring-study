/**  
* Title: HomeControllerTest.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年7月17日  
* @version 1.0  
*/  
package spitterWebAppTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import spitter.web.HomeController;

/**  
* Title: HomeControllerTest
* Description: 测试用例
* @author xuchang 
* @date 2018年7月17日  
*/
public class HomeControllerTest {
	
	
	@Test
	public void testToHome() throws Exception {
		HomeController co=new HomeController();
		MockMvc mockMvc=MockMvcBuilders.standaloneSetup(co).build();	//构建MockMvc
		mockMvc.perform(get("/")).andExpect(view().name("home")); 		//预期得到home视图
	}
	
	
}
