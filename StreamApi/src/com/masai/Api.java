package com.masai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Api {

	public static void main(String[] args) {
		
		Collection<Integer> intList = List.of(1,2,2,3,4,5,6);
//		
//		Stream<Integer> ls=intList.stream();
//		ls.reduce(0,(i1,i2)->i1+i2);
//		
//		System.out.println(intList.stream().min((i,j)->i-j).get());
//		
//		ToIntFunction<Integer> tif = i->i*1;
//		System.out.println(intList.stream().collect(Collectors.averagingInt(tif)));
		
		
//		List<Integer>	its =	intList.stream().collect(Collectors.toList());
//		its.forEach(System.out::println);
		
		
		Function<Integer, Integer> keyMapper  = i->i*1;
	     Function<Integer, Integer> valueMapper  = i->i+i;
	     
	     
//	     Map<Integer, Integer> map = intList.stream().collect(Collectors.toMap(keyMapper, valueMapper));
	     
//	     System.out.println(map);
	     
	     
//	 	Collection ts= intList.stream().filter(i->i>=5).collect(Collectors.toList());
	 	
	 	Set<Integer> uniqueList = intList.stream().collect(Collectors.toSet());
	 	
			System.out.println(uniqueList);
//	 	System.out.println(newIntList);
	 	System.out.println("=================================================");
	 	intList.stream().distinct().forEach(s->System.out.print(s+" "));
	 	
	 	List<Student> studentList = new ArrayList<>();
        
        studentList.add(new Student(23,"Saurav",345));
		studentList.add(new Student(23,"Kunal Kumar",245));
		studentList.add(new Student(25,"Pankaj Singh",100));
		studentList.add(new Student(26,"Rahul Yadav",245));
		studentList.add(new Student(27,"Deepak",60));
//	 	
//	 studentList.stream().filter(i->i.getMarks()>200).map(s->new Student(s.getRollno(),s.getName(),s.getMarks()+3000)).collect(Collectors.toList()).forEach(s->System.out.println(s+" "));
//		
//	 Stream<Integer> fileterdSteasm = intList.stream().filter(i->i>=5);
//		fileterdSteasm.forEach(System.out :: println);
	 
	studentList.stream().sorted((s1,s2)->s1.getMarks()>s2.getMarks()?-1:1).skip(2)
        .forEach(s->System.out.println(s));
		
	
	
	System.out.println();
	
	studentList.stream().sorted((s1,s2)->s1.getMarks()>s2.getMarks()?-1:1).limit(3)
    .forEach(s->System.out.println(s));
	
	System.out.println();
	studentList.stream().sorted((s1,s2)->s1.getMarks()>s2.getMarks()?-1:1).skip(1).limit(3)
    .forEach(s->System.out.println(s));
	}
	
	
}
