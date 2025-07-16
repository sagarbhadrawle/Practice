package com.masaischool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class B {
	
	A a;
	
	@Autowired
public	B( A a)
	{
		this.a = a;
		System.out.println("inside constructor :: B");
		System.out.println(a);
	}
	
	
}
