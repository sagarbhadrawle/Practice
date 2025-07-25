package com.masai;

	public class Demo {
		
		
		   void fun(int...value) {
			   for(int t : value)
			   {
				   System.out.println(t);
			   }
		   }
		
		public static void main(String[] args) {
			
			double v = 12.0003498	;
			String st = String.format("%.2f", v);
			System.out.println(st);
			
			String s  = "sagar";
			String l = s.replace("a","b");
			System.out.println(l.toUpperCase().toLowerCase());
			
//			char[] charArray = s.toCharArray();
//			for(Character sk : charArray)
//			{
//				System.out.println(sk);
//			}
//			
			
			
			StringBuilder sb = new StringBuilder("sagar");
			sb.append("bhadrawle");
			System.out.println(sb.toString());
			
			boolean equals = s.equalsIgnoreCase(l);
			System.out.println(equals);
			String s1="Hello";  
			   String s2="Hello";
			   String  s3 = new String("hello");
			   System.out.println(s1==s3);
			
Demo t = new Demo();
t.fun(2,3,4,5,6,4);
			   
			   
			
		}
		
}
class Animal{
	
	void eat()
	{
		System.out.println("eat");
	}
	
}

class Dog extends Animal{
	
	public static void main(String[] args) {
		
		Dog d  = new Dog();
		Animal a = new Dog();
		
		
		System.out.println(d instanceof Animal);
	}
}
enum Color{
RED,
YELLOW,
PINK
}



class Test {

	enum Color {
		RED,
		GREEN,
		BLUE;
		
		public void info(){
			System.out.println("This is Rice");
		}
	}

	public static void main(String[] args)
	{
		// Calling values()
		Color arr[] = Color.values();


		for (Color col : arr) {
			// Calling ordinal() to find index of color
			System.out.println(col + " at index " + col.ordinal());
		}
		
	}
}