package com;
import java.util.*;


class Demo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{23,23},{23,23232,2323}};
			for(int[] row : arr ) {
				for( int num :row)
				{
					System.out.println(num);
				}
				System.out.println();
				
			}
		

	}
}



















//String str = "luffy";
//Map<Character, Integer> object = new LinkedHashMap<>();
//
//for (int i = 0; i < str.length(); i++) {
//    char ch = str.charAt(i);
//    if (!object.containsKey(ch)) {
//        object.put(ch, 1);
//    } else {	
//        object.put(ch, object.get(ch) + 1);
//    }
//}
//System.out.println(object);