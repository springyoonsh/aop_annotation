package com.example.aop_annotation;

import org.springframework.stereotype.Service;

@Service
public class Jean implements Cloth
{
	@Override
	public void weaving() 
	{
		System.out.println("û���� �����κ� ��������...");		
	}
	
}
