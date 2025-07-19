package com.masaischool.B28_SB201_Ex_24.service;

import java.util.List;

import com.masaischool.B28_SB201_Ex_24.entity.Student;

public interface StudentService {

	public Student addStudent(Student st);
	
	public Student viewStudentByRoll(Integer roll);
	
	public List<Student> viewStudentByMarksRange(Integer start, Integer end);
	
	public List<String> viewStudetByMarks(Integer marks);
	
	public List<String> viewAllStudentByNQ();
	
	public List<Student> viewStudentByRollGreaterThanOrMarks(Integer roll,Integer marks);
	
	public List<Student> viewAllStudent();
	
//	public List<StudentDTO> getDetailsByRollNumberMore(Integer roll);
	
	public List<Student> getTop5ByOrderByNameDesc();
	
	public List<Student> getTop3ByMarksGreaterThan(Integer marks);
	
	public List<Student> getByCustomerSortOrders(String fieldOne, String directionOne, String fieldTwo,String directionTwo);
	
	public List<Student> getStudentsPageWise(int page, int size);
	
//	public Student updateStudent(Integer roll, Integer marks);
//	
//	public String deleteStudentByRoll(Integer roll);
}
