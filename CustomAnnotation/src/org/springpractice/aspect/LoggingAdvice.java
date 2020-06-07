package org.springpractice.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice
{
	
	@After("args(String)")
	public void Stringarg()
	{ 
		//runs wether the concerned method runs successfully or not
		System.out.println("method with string argument runs");
	}
	
/*	@AfterReturning("args(name)")
	public void Stringarg1(String name)
	{
		System.out.println("method with string argument runs"+ name);
	}
	*/
	
	
	@AfterReturning(pointcut="args(name)",returning="returnString")
	public void Stringarg1(String name, Object returnString)
	{  
		//to get handle on the value returned by the method, following the pointcut
		System.out.println("method with string argument runs"+ name + "the output value is" + returnString);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void Stringarg2(String name, RuntimeException ex)
	{
		//to get handle on the value returned by the method, following the pointcut
		System.out.println("exception advice"+ name+ "throwing" + ex);
	}
	
	//@Around("allgetters()")
	@Around("@annotation(org.springpractice.aspect.Loggable)")
	//configuring CUSTOM ANNOTATION Inside @Around, giving path of the annotation
	public Object AroundAdvice(ProceedingJoinPoint pjp)
	{ 
		Object ob=null;
		System.out.println("Before Advice");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("After throwing");
			e.printStackTrace();
		}
		System.out.println("after returning");
		return ob;
	}
	
	@Pointcut("execution(public * get*())")
	public void allgetters()
	{
		
	}
	
	@Pointcut("within(org.springpractice.model..*)")
	public void allmodels()
	{
		
	}
}
