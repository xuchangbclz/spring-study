/**  
* Title: Test.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年7月12日  
* @version 1.0  
*/  
package javaproxy;

import javaproxy.cglib.Usb;

/**  
* Title: Test
* Description: 
* @author xuchang 
* @date 2018年7月12日  
*/
public class Test {
	
	
	public static void main(String[] args) {
		
//		Usb u=new Usb();
//		UsbInterface ui=new STielineUsb(u);
//		ui.openInterface();
		
//		UsbInterface target=new Usb();
//		System.out.println(target.getClass().getName());   //Usb
//		UsbInterface proxy=(UsbInterface)new ProxyFactory(target).getProxyIntance();
//		System.out.println(proxy.getClass().getName());  //proxy对象
//		proxy.openInterface();
		
		Usb taget=new Usb();
		Usb proxy=(Usb)new javaproxy.cglib.ProxyFactory(taget).getProxyIntance();
		proxy.openInterface();
		
		
	}
	
}
