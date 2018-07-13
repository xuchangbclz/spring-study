/**  
* Title: TielineUsb.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年7月12日  
* @version 1.0  
*/  
package aspect.injectNewFunction;


/**  
* Title: TielineUsb
* Description: 代理转接线实现
* @author xuchang 
* @date 2018年7月12日  
*/

public class TielineUsb  implements TielineUsbInterface {

	@Override
	public void tielineUsbInterface() {
		// TODO Auto-generated method stub
		System.out.println("link tieline ...");
	}

}
