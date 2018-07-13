/**  
* Title: ProxyBeanConfig.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年7月11日  
* @version 1.0  
*/  
package aspect.injectNewFunction.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

import aspect.injectNewFunction.TielineUsb;
import aspect.injectNewFunction.TielineUsbInterface;

/**  
* Title: ProxyBeanConfig
* Description: 代理类配置
* @author xuchang 
* @date 2018年7月11日  
*/

@Aspect
public class ProxyBeanConfig {
	
	/**
	 * value 为哪个类创建代理 ,UsbInterface及其子类创建代理
	 * defaultImpl 代理接口的默认实现类
	 */
	@DeclareParents(value="aspect.injectNewFunction.UsbInterface+",defaultImpl=TielineUsb.class)
	public static TielineUsbInterface eielineUsbInterface;
	
}
