package com.example.aop_annotation;

import org.springframework.stereotype.Service;

@Service
public class Jean implements Cloth
{
	@Override
	public void weaving() 
	{
		System.out.println("청바지 무릎부분 박음질중...");		
	}
	
}
