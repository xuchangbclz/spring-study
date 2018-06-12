/**  
* Title: CleanAction.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月5日  
* @version 1.0  
*/  
package springaction.robot;

import java.io.PrintStream;

/**  
* Title: CleanAction
* Description: 
* @author xuchang 
* @date 2018年6月5日  
*/
public class CleanAction implements Action {
	
	private PrintStream ps;
	
	public CleanAction(PrintStream ps) {
		this.ps=ps;
	}
	
	@Override
	public void doing() {
		// TODO Auto-generated method stub
		ps.println("已执行清扫...");
	}


}
