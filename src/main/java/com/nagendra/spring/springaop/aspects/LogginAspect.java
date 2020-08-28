package com.nagendra.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
// Here we are having 2 Advices ---> Before & After Advice
public class LogginAspect {

	// PointCut Expression
	@Before("execution(* com.nagendra.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinpoint) {
		System.out.println("Before Calling the Method");
	}

	// PointCut Expression
	@After("execution(* com.nagendra.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinpoint) {
		System.out.println("After the Method Invocation");
	}
}
