package com.masaischool.B28_SB201_Ex_24.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masaischool.B28_SB201_Ex_24.entity.Student;
import com.masaischool.B28_SB201_Ex_24.service.StudentService;

@RestController
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
	
		this.studentService = studentService;
	}
	
	
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student st)
	{
		return new ResponseEntity<Student>(studentService.addStudent(st),HttpStatus.CREATED);
	}
	

	@GetMapping("/students")
	public ResponseEntity<List<Student>> viewAllStudent()
	{
		return new ResponseEntity<List<Student>>(studentService.viewAllStudent(),HttpStatus.OK);
	}
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> viewStudentByRoll(@PathVariable Integer roll)
	{
		return new ResponseEntity<Student>(studentService.viewStudentByRoll(roll),HttpStatus.OK);
	}
	
//	@GetMapping("/students/{name}")
//	public ResponseEntity<Student> viewStudentByName(@PathVariable Integer name)
//	{
//		return new ResponseEntity<Student>(studentService.viewStuden(name),HttpStatus.OK);
//	}
	
	
//	public ResponseEntity<List<Student>>
	
	
}
