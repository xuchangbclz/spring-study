/**  
* Title: Usb.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月25日  
* @version 1.0  
*/  
package aspect.injectNewFunction;

import org.springframework.stereotype.Component;

/**  
* Title: Usb
* Description: usb实现类
* @author xuchang 
* @date 2018年6月25日  
*/

@Component
public class Usb implements UsbInterface {


	@Override
	public void openInterface() {
		// TODO Auto-generated method stub
		System.out.println("open interface...");
	}
	
	
	
	
}
