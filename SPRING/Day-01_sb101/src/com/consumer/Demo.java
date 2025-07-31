package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {
		
		Consumer<Integer> c1 = new MyConsumer();
		c1.accept(23);
		
		Consumer<Integer> c2 = n->System.out.print(n+100);
		c1.accept(23);
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(23,"sagar", 560));
		list.add(new Student(24,"abhi", 360));
		list.add(new Student(25,"raj", 660));
		list.add(new Student(26,"tej", 860));
		list.add(new Student(27,"pk", 660));
		
		for(Student st : list)
		{
			System.out.println(st);
			
		}
		
		list.forEach(s->System.out.println(s.getName().toUpperCase()));
	}
}


