/**  
* Title: Audience.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月21日  
* @version 1.0  
*/  
package aspect.execution;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**  
* Title: Robot
* Description: @Aspect定义切面,@Before定义通知
* @author xuchang 
* @date 2018年6月21日  
*/

@Aspect
public class Robot {
	
	private int current=0;
	
	/**
	 * 
	 * Title: pointcut 
	 * Description:定义可重用切点,避免相同execution重复写
	 */
	@Pointcut("execution(* aspect.execution.Working.perform(..))")
	public void pointcut() {};
	
	/**
	 * 
	 * Title: argsExe 
	 * Description:定义切面传参  
	 * @param count
	 */
	@Pointcut("execution(* aspect.execution.Working.robotOutFileNum(int)) && args(count)")
	public void argsExe(int count) {};
	
	@Before("argsExe(count)")
	public void getCount(int count) {
		
		System.out.println("已经有"+(current+=count));
		
	}
	
	/**
	 * 
	 * Title: roundAdvice 
	 * Description:环绕通知  ProceedingJoinPoint
	 * @param pt
	 * @throws Throwable
	 */
	@Around("pointcut()")
	public void roundAdvice(ProceedingJoinPoint pt) throws Throwable {
		System.out.println("语音助手Working...");
		pt.proceed();
		System.out.println("语音助手Working...");
	}
	
	/**
	 * 
	 * Title: prepareTool 
	 * Description:执行之前
	 */
	@Before("execution(* aspect.execution.Working.perform(..))")
	public void prepareTool() {
		System.out.println("准备Working...");
		
	}
	
	/**
	 * 
	 * Title: afterWork 
	 * Description:正常返回或者异常执行
	 */
	@After("execution(* aspect.execution.Working.perform(..))")
	public void afterWork() {
		System.out.println("放松1...");
		
	}
	
	/**
	 * 
	 * Title: afterWork2 
	 * Description:正常返回后执行
	 */
	@AfterReturning("execution(* aspect.execution.Working.perform(..))")
	public void afterWork2() {
		System.out.println("放松2...");
		
	}
	
	/**
	 * 
	 * Title: errorWork 
	 * Description:抛出异常后执行
	 */
	@AfterThrowing("execution(* aspect.execution.Working.perform(..))")
	public void errorWork() {
		System.out.println("工作错误...");
		
	}
	
}
