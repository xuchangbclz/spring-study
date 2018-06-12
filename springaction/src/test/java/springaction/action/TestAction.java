/**  
* Title: TestAction.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月5日  
* @version 1.0  
*/  
package springaction.action;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import springaction.robot.Action;
import springaction.robot.CleanAction;
import springaction.robot.RobotAction;


/**  
* Title: TestAction
* Description: 
* @author xuchang 
* @date 2018年6月5日  
*/


public class TestAction {
	
	@Test
	public void TestDo() {
		
		Action a=	mock(CleanAction.class);
		RobotAction ra=new RobotAction(a);
		ra.excu();
		verify(a, times(1)).doing();
		
	}
	
}
