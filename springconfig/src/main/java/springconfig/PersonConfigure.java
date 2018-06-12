/**  
* Title: PersonConfigure.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月7日  
* @version 1.0  
*/  
package springconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**  
* Title: PersonConfigure
* Description: 
* @author xuchang 
* @date 2018年6月7日  
*/

@ComponentScan(basePackages="test")
@Configurable
public class PersonConfigure {
	
	
}
