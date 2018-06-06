/**  
* Title: RobotAction.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月5日  
* @version 1.0  
*/  
package springaction.robot;

/**  
* Title: RobotAction
* Description: 
* @author xuchang 
* @date 2018年6月5日  
*/
public class RobotAction {
	
	private Action act;
	
	
	public RobotAction(Action a) {
		this.act=a;
	}
	
	public void excu() {
		act.doing();
	}
	
	
	
}
