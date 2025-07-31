package com.msai;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
	
		Map<Integer, String> map = new LinkedHashMap<>();

		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");

		System.out.println(map);

		System.out.println("getting all the keys");
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		for (int key : keys) {
			System.out.print(key + " ");
		}
		System.out.println();
	}	

}