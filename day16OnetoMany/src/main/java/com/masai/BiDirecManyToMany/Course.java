package com.masai.BiDirecManyToMany;

import java.util.Set;

import com.masai.UniManyToOne.Student;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	
	private String cname;
	
	@ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL)
	private Set<Student1> students;

	int getCid() {
		return cid;
	}

	void setCid(int cid) {
		this.cid = cid;
	}

	String getCname() {
		return cname;
	}

	void setCname(String cname) {
		this.cname = cname;
	}

	Set<Student1> getStudents() {
		return students;
	}

	void setStudents(Set<Student1> students) {
		this.students = students;
	}
	
	
}
