package com.masaischool;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages= {"com.masaischool"})
@PropertySource("a1.properties")
public class AppConfig {
//	@Bean(value = "aobj")
//	A getObj1()
//	{
//		A a = new A();
//		return a;
//		
//	}
//	
	
//	@Primary
//	@Bean(value="abc" )
//	A getObj2()
//	{
//		A a  = new A();
//		return a;
//	}
}
