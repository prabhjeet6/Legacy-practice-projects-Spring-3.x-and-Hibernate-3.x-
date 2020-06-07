package org.springpractice.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice
{
		
	
	@Before("allgetters()")
	public void LoggingAdvice(JoinPoint joinpoint)
   {
	   System.out.println("logging Advice Run. ");
	   System.out.println(joinpoint.toString());//tells where the advice invocation occured 
	   System.out.println(joinpoint.getTarget());//tells the target obj
   }
	
	/*JoinPoints are required, when an advice needs to be run for multiple methods,
	but they have different requirements, e.g. different arguments,different target objects,
	and different invocations for the advice*/
	
	//@Before("args(String)")
	//to invoke an advice, if a business method with string argument executes
	
	@Before("args(name)")
	//passes the parameter name of the argument,so as to print it in the advice 
	
	public void allCircle(String name)
	{
		System.out.println("method with string arg called" + name);
	}
	@Pointcut("within(org.springpractice.model..*)")
	public void allgetters()
	{
		
	}
}
