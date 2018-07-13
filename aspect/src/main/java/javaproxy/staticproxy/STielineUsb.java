/**  
* Title: Usb.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年7月12日  
* @version 1.0  
*/  
package javaproxy.staticproxy;

import javaproxy.UsbInterface;

/**  
* Title: Usb
* 
* Description: Java静态代理类,  
* 代理对象与目标对象要实现相同的接口,然后通过调用相同的方法来调用目标对象的方法
* 缺点:因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
* @author xuchang 
* @date 2018年7月12日  
*/
public class STielineUsb implements UsbInterface  {
	
	
	private UsbInterface ui;
	
	public STielineUsb(UsbInterface ui) {
		this.ui=ui;
	}
	
	@Override
	public void openInterface() {
		// TODO Auto-generated method stub
		System.out.println("link tieline ...");
		ui.openInterface();
	}
	
	
	
}
