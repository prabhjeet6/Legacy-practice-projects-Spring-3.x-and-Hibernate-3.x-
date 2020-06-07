package org.springpractice.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
public class LoggingAdvice
{
	/*@Before("execution(public String getName())")
	for all methods that match the above method signature*/
	
/*@Before("execution(public String org.springpractice.model.Circle.getName())")
for all methods that match the above method signature with the specified
 package*/
  
	/*@Before("execution(public * get*(..))")
for all methods that satisfy the wild cards,here .. inside get*() mean 0 
or more parameters.*/ 
	/*
if multiple businesslogic methods require a particular aspect method 
to run, then we can use wild cards as above, but, if multiple aspect 
methods are required to run for one or more business logic methods
then, we have two options.
either, we can specify, @Before annotation for every aspect method, with 
the wildcards.
or, we can define a pointcut, which contains, businesslogic method 
specifications, with wildcards.
@Pointcut will be defined for a dummy method, as, annotations are always 
applied to some logical construct.
And @Before annotation will have dummy method as parameter, to trigger
the pointcut.
this design helps in making lesser changes, if any, in wild card method 
specification, since, the specification is only present in Pointcut,and
others use the dummy method*/

	
	@Before("allgetters()")
	  public void SecondLoggingAdvice()
	   {
		   System.out.println("Second logging Advice Run. ");
	   }

	@Before("allgetters()")
	public void LoggingAdvice()
   {
	   System.out.println("logging Advice Run. ");
   }
	
	@Pointcut("execution(public * get*(..))")
	public void allgetters()
	{
		
	}
}
