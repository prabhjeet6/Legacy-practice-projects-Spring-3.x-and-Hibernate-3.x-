package org.springpractice.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class LoggingAdvice
{
		
	
	@Around("allgetters()")
	public Object AroundAdvice(ProceedingJoinPoint pjp)
   {
	   System.out.println("Before Advice Run. ");
	   Object returnval="null";
	  try {
		returnval= pjp.proceed();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return returnval;
	   
   }
	
	
	@Pointcut("execution(* get*() )")
	public void allgetters()
	{
		
	}
}
