package com.predicate;

import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		
		Predicate<Integer> pd = new MyPredicate();
		System.out.println(pd.test(0));
			
//		 Lambda Expression
		
		Predicate<Integer> p2 = p->p>0;
		System.out.println(p2.test(1));
	}
	
}
