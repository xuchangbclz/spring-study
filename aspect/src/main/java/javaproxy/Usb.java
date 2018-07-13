/**  
* Title: Usb.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年7月12日  
* @version 1.0  
*/  
package javaproxy;

import javaproxy.UsbInterface;

/**  
* Title: Usb
* Description: 目标（委托）对象
* @author xuchang 
* @date 2018年7月12日  
*/
public class Usb implements UsbInterface {

	@Override
	public void openInterface() {
		// TODO Auto-generated method stub
		System.out.println("open Usb...");
	}
	
	
}
