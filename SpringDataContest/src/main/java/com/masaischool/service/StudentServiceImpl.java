package com.masaischool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.masaischool.entity.Student;
import com.masaischool.exception.StundentNotFoundRoll;
import com.masaischool.respository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository str;

	public StudentServiceImpl(StudentRepository str) {
		super();
		this.str = str;
	}

	@Override
	public Student findByMarks(int roll) {

		Student student = str.findByRoll(roll);
		System.out.println(student.getName() + " " + student.getMarks() + " " + student.getRoll());

		return student;
	}

	@Override
	public String addStudent(Student s) {
		// TODO Auto-generated method stub

		str.save(s);

		return "added";
	}

	@Override
	public List<Student> findAllStudent() {
		
		List<Student> all = str.findAll();
		
		return all;
	}

	@Override
	public Student updateName(int roll,String name) {
		// TODO Auto-generated method stub
		
		Student byRoll = str.findByRoll(roll);
		
		byRoll.setName(name);;
		
		str.save(byRoll);
		
		return byRoll;
	}
	
	
	
	

}
