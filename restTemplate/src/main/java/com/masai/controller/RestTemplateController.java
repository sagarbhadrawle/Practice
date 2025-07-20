package com.masai.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.masai.model.Student;

@RestController

public class RestTemplateController {
	
		@GetMapping("/get_student_by_roll_no/{rollNo}")
		public ResponseEntity<Student> getStudentByRollNo(@PathVariable Integer rollNo)
		{
			String url = "http://localhost:9090/student/students/"+rollNo;
			RestTemplate template = new RestTemplate();
			
			return template.getForEntity(url, Student.class);
		}
	
		@PostMapping("/add_student_resttemplate")
		public ResponseEntity<Student> addStudentByRestTemplate(@RequestBody Student student)
		{
				String url = "http://localhost:9090/student/students";
				RestTemplate templ = new RestTemplate();
				return templ.postForEntity(url, templ, Student.class);
						
		}
		
}
