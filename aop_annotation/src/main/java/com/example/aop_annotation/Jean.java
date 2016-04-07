package com.example.aop_annotation;

import org.springframework.stereotype.Service;

@Service
public class Jean implements Cloth
{
	@Override
	public void join(String param) 
	{
		System.out.println("청바지 구멍을 천으로 박음질중...");		
	}	
}
