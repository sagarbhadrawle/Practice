package com.masaischool.service;

import java.util.List;

import com.masaischool.entity.Student;

public interface  StudentService {
	
	
	public Student findByMarks(int roll); 
	
	public String addStudent(Student s);
	
	public List<Student> findAllStudent();
	
	public Student updateName(int roll,String name);
}
