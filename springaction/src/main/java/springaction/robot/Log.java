/**  
* Title: Log.java 
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
* Title: Log
* Description: 
* @author xuchang 
* @date 2018年6月5日  
*/
public class Log {
	
	private PrintStream ps;
	
	
	public Log(PrintStream ps) {
		// TODO Auto-generated constructor stub
		this.ps=ps;
	}
	
	public void excuBefore() {
		
		ps.println("Prepration Start excuting...");
		
	}
	
	public void excuAfter() {
		
		ps.println("excut Ending...");
		
	}
	
	
}
