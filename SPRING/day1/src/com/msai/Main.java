package com.msai;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main extends A {

	public static void main(String[] args){
		
	Queue<Student> q = new PriorityQueue<>(new StudentMarksComparator());
		
		q.add(new Student(10, "Sumit", 550));
		q.add(new Student(20, "Shivam", 650));
		q.add(new Student(15, "Vivek", 750));
		q.add(new Student(50, "Anurag", 850));
		q.add(new Student(25, "Aman", 500));
		q.add(new Student(10, "Zola", 550));
		q.add(new Student(15, "Rogers", 750));
		
		System.out.println(q);
		
		//System.out.println(q.peek());
	}
}
