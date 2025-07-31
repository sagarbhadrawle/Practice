package com.predicate;

import java.util.function.Predicate;

public class MyPredicate  implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		if(t>0)
		{
			return true;
			
		}
		else { 
			return false;
		} 
	}
	
 
}
				 