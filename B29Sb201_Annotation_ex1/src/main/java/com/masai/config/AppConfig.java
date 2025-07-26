package com.masai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.masai.p1.A;

@Configuration

public class AppConfig {
	
	
	public AppConfig() {
		System.out.println("inside construct of appconfig");
	}
	
	
	@Bean(value = "a",initMethod = "begin",destroyMethod = "end")
	public A getObject()
	{	
		System.out.println("inside appconfig :: getobject");
		return new A();
	}
	
	
}
