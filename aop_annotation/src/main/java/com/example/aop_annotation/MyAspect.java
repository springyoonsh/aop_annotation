package com.example.aop_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class MyAspect 
{
	// 이부분 전체를 수선천advice
	@Before(" execution(* com.example.aop_annotation.*.weaving*(..)) ")
	public void before(JoinPoint joinpoint)
	{
		System.out.println("before...");
		System.out.println ( joinpoint.getSignature().toShortString() );
	}
}
