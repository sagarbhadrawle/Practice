package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.Function;
import java.util.stream.Collectors;

interface Intr{
	void sayHello();
}

public class Part {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(5);
		q.add(6);
		q.add(1);
		
		System.out.print(q.poll());
		
		Intr i = new Intr()
				{

			
					@Override
					public void sayHello() {
						// TODO Auto-generated method stub
						
					}
				
				};
				
				
				Map<Integer, String> map = new LinkedHashMap<>();
				map.put(1, "Monday");
				map.put(2, "Tuesday");
				map.put(3, "Wednesday");
				map.put(5, "Friday");
				map.put(6, "Saturday");
		
				map.forEach((k,v)->System.out.println(k+" "+v));
				
				List<Student> studentList = new ArrayList<>();
		        
		        studentList.add(new Student(23,"Saurav",345));
				studentList.add(new Student(23,"Kunal Kumar",245));
				studentList.add(new Student(25,"Pankaj Singh",100));
				studentList.add(new Student(26,"Rahul Yadav",245));
				studentList.add(new Student(27,"Deepak",60));
				
				
				studentList.stream().filter(s->s.getMarks()>250).forEach(System.out::println);
				
				         
				List<Integer> intList =List.of(1,3,4,6,2);
				
				List<Integer> collect = intList.stream().map(j->j*j).collect(Collectors.toList());
				
				System.out.println(collect);
				
//				studentList.stream().filter(i->i.getMarks()<=300).map(i->new Student(i.getRoll(),i.getName(),i.getMarks()+322232)).toList();
//				
				System.out.println("==========================");
				studentList.stream().sorted((s1,s2)->s1.getMarks()>s2.getMarks()?1:-1).forEach(s->System.out.println(s.getName()+" "+s.getMarks()));
				
				Map<Integer, String> map1 = new LinkedHashMap<>();
				map.put(1, "Monday");
				map.put(2, "Tuesday");
				map.put(3, "Wednesday");
				map.put(5, "Friday");
				map.put(6, "Saturday");
				
				System.out.println(map);
				System.out.println("sagar");
				Function<Integer, String> f1 = dayNum -> {
					String dayName = null;
					switch(dayNum) {
						case 1:
							dayName = "Mon";
							break;
						case 2:
							dayName = "Tue";
							break;
						case 3:
							dayName = "Wed";
							break;
						case 4:
							dayName = "Thu";
							break;
						case 5:
							dayName = "Fri";
							break;
						case 6:
							dayName = "Sat";
							break;
						case 7:
							dayName = "Sun";
							break;
					}
					return dayName;
				};
				//for key that doesn't exists but will not compute to null
				System.out.println(map1.computeIfAbsent(4, f1));
				
				System.out.println(map1.computeIfAbsent(1, f1));
				
				System.out.println(map1);
				
				Intrl tq = Method::getMini;
				
				System.out.println(tq);
				
				 List<Integer> numbers = Arrays.asList(15, 33, 59, 24, 40, 2, 19, 25,60);
				    
				Collections.sort(numbers,(j,i1)->j>i1?1:-1);
				
			
	}
	
}


class Method{
	
	static void getMini()
	{
		System.out.println("1");
	}
	
}


interface Intrl{
	
	void getMini();
}


class Person {
    private String name;

    public Person(final String name) {
        System.out.println("Constructor Called");
				this.name = name;
    }

    public String toString() {
        return "Name = " + name;
    }
}
interface MyFunctionalInterface{
	Person getPerson(String name);
}


class Main{
	public static void main(String[] args) {
		
		
		MyFunctionalInterface mf = Person::new;
		Person person = mf.getPerson("sagar");
		System.out.println(person);
				
		InterestCalculator ic = new InterestCalculator() ;
		
		Relational re = ic :: getAmountByCompundInterest;
		double amount = re.getAmount(12, 12, 12);
		System.out.println(amount);
	}
	
	
	
}


class InterestCalculator{//this code is by Anu
	  double getAmountBySimpleInterest(double principleAmount, double timePeriod, double interestRate) {
	    double amount = principleAmount + ((principleAmount * timePeriod * interestRate) / 100);
	    return Math.round(amount * 100) / 100.0;
	  }
	  
	  double getAmountByCompundInterest(double principleAmount, double timePeriod, double interestRate) {
	    double amount = principleAmount * Math.pow((1 + interestRate/ 100), timePeriod);
	    return Math.round(amount * 100) / 100.0;
	  }
	}


@FunctionalInterface
interface Relational{  //this code is by Bhakti
  double getAmount(double principleAmount, double timePeriod, double interestRate);
}


