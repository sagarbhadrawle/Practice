package com.masaischool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    /**
     * @param args
     */
    public static void main( String[] args ){
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	A bean = context.getBean("a", A.class);
    	bean.toString();
    	bean.set();
    	
    	System.out.println(bean);
    	
//    	C bean2 = context.getBean("c", C.class);
//    	bean2.toString();
//    	
//    	System.out.println("a = " + context.getBean("a", A.class));
//    	System.out.println("abc = " + context.getBean("abc", A.class));
    }
    
}

