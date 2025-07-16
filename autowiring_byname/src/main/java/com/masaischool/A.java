package com.masaischool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class A {
	private int i;
	private String name;

	@Autowired
	private Environment e;
	
	void set()
	{
		System.out.println("The enviroment object is of"+ e.getClass().getName()+" class");
		
		i = Integer.valueOf(e.getProperty("intvalue"));
		name = e.getProperty("strvalue");
		
	}
	
	
	
	@Override
	public String toString() {
		return "A [i=" + i + ", name=" + name + "]";
	}
	
	
	
	
}
