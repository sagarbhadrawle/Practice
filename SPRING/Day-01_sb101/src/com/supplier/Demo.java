package com.supplier;

import java.util.function.Supplier;

public class Demo {
	
	public static void main(String[] args) {
		
		Supplier<Integer> s1 = new MySupplier();
		System.out.println(s1.get());
		
		Supplier<Integer> s2 = ()->23;
		System.out.println(s2.get());
		
	}
}
