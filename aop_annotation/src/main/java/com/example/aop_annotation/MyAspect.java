package com.example.aop_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class MyAspect 
{
	// advice ����õ 
	@Before(" execution(* com.example.aop_annotation.Jean.join*(..)) ") //���� pointcut
	public void before(JoinPoint joinpoint)
	{
		System.out.println("before...");
		
		Object[] arr = joinpoint.getArgs();
		
		System.out.println( arr[0] );
	}
}
