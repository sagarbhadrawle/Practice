package com.masai.p1;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


public class A implements InitializingBean,DisposableBean {
	
	public A() {
	System.out.println("inside a const");
	}
	
	void begin()
	{
		System.out.println("inside A:: begin");
	}
	
	void end()
	{
		System.out.println("Inside A::End");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("inside destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("inside after properties set");
		
	}
	
	
	@PostConstruct
	void start()
	{
		System.out.println("inside A:: start");
	}
	
	
	@PreDestroy
	
	public void shutdown()  {
		System.out.println("inside shutdown");
		
	}
}
