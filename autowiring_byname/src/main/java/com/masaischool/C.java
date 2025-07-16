package com.masaischool;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class C {
	
	
	
	public C() {
		System.out.println("inside constructor C");
		// TODO Auto-generated constructor stub
	}

	@Value("${intvalue}")
	private int i;
	
	@Value("${strvalue}")
	private String name;

	@Override
	public String toString() {
		return "C [i=" + i + ", name=" + name + "]";
	}
	
	
	
}
