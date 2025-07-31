package com.msai;

import java.util.Objects;

public class Student  
//implements Comparable<Student>{
{
	private int roll;
	private String name;
	private int marks;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "[roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

//	@Override
//	public boolean equals(Object obj) {
//		
//		Student  s1 = this;
//		Student  s2 = (Student) obj;
//		
//		if(s1.getRoll() == s2.getRoll() && s1.getName().equals(s2.getName()) &&  s1.getMarks() == s2.getMarks())
//		{
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	  @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Student other = (Student) obj;
	        return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
	    }
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(marks,name,roll);
		
	}
//	@Override
//	public int compareTo(Student o) {
//		
//		Student s1= this;
//		Student s2 = o;
//		
//		return s1.getName().compareTo(s2.getName());
//			
//	
//		
//	}
	
	
	
		
	
}
