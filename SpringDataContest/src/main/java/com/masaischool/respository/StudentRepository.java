package com.masaischool.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masaischool.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public Student findByRoll(int roll);
	public List<Student> findAll();
	
}
