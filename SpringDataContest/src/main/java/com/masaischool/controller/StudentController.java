package com.masaischool.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masaischool.entity.Student;
import com.masaischool.service.StudentServiceImpl;

@RestController

public class StudentController {
	
	private StudentServiceImpl studentServiceImpl;
	
	
	
	
	public StudentController(StudentServiceImpl studentServiceImpl) {
		super();
		this.studentServiceImpl = studentServiceImpl;
	}




	@PostMapping("/students")
	public ResponseEntity<String> addStudent(@RequestBody Student student)
	{
			
//		String st = studentServiceImpl.addStudent(student);
		
		return new  ResponseEntity<String>(studentServiceImpl.addStudent(student),HttpStatus.OK);
	}
	
	
	@GetMapping("/student/{roll}")
	public ResponseEntity<Student> viewStudentByRoll(@PathVariable Integer roll)
	{
		return new ResponseEntity<Student>(studentServiceImpl.findByMarks(roll),HttpStatus.OK);	
	}
	
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> viewAllStudent()
	{
		return new ResponseEntity<List<Student>>(studentServiceImpl.findAllStudent(),HttpStatus.OK);
	}
	
	
	@PatchMapping("/student/{roll}/{name}")
	public ResponseEntity<Student> updateName(@PathVariable Integer roll, @PathVariable String name)
	{
		
		return new ResponseEntity<Student>(studentServiceImpl.updateName(roll, name),HttpStatus.CREATED);
	}
	
}
