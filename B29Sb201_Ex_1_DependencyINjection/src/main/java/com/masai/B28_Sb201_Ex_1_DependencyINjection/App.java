package com.masai.B28_Sb201_Ex_1_DependencyINjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 	ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
    	 	
    	 	A a  = context.getBean("a",A.class);
    	 	
    	 	a.fun();
    	 	
    }
}
