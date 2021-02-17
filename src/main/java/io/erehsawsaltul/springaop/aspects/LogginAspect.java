package io.erehsawsaltul.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {
	
	@Before("execution(* io.erehsawsaltul.springaop.daos.multiply(..))")
	public void logBefore(JoinPoint joinPoint){
		System.out.println("Before Calling the method");
	}
	
	@After("execution(* io.erehsawsaltul.springaop.daos.multiply(..))")
	public void logAfter(JoinPoint joinPoint){
		System.out.println("After the method is invoked");
	}
}
