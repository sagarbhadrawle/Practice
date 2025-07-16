package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;

import jakarta.annotation.PostConstruct;

@RestController
public class StudentController {
	private List<Student> listStudent;

	public StudentController() {
		listStudent = new ArrayList<>();
	}

	
	@PostConstruct
	public void startUp() {
		listStudent.add(new Student(1, "ABC", 75.00));
		listStudent.add(new Student(2, "BCD", 85.00));
		listStudent.add(new Student(3, "CAB", 95.00));
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudent(){
		ResponseEntity<List<Student>> response = new ResponseEntity<List<Student>>(listStudent,HttpStatus.OK);
		return response;
		
	}
	
}
