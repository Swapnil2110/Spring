package com.maven.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

	//	EXECUTES BEFORE methodFromAlien METHOD
//	@Before("execution(public void methodFromAlien())")
	
	// 	EXECUTES BEFORE ship1 METHOD
//	@Before("execution(public void ship1())")
	
	//	EXECUTES BEFORE EVERY METHOD FROM Spaceship Class
//	@Before("execution(* com.maven.aop.Spaceship.*())")
	
	//	EXECUTES BEFORE EVERY METHOD FROM EVERY CLASS OF com.maven.aop PACKAGE
	@Before("execution(* com.maven.aop.*.*())")
	public void log() {
		System.out.println("Log methos from aspect");
	}
}
