package com.example.aop_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop_annotation.xml");
		Cloth jean = (Cloth)ctx.getBean("jean");
		jean.weaving();
	}
}	
