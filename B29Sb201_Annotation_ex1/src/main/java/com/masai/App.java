package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.config.AppConfig;

public class App {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("insdie main");
		
//		context.close();
		
		context.registerShutdownHook();
	}
	
	
}
