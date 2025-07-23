package com.masai.BiDirecManyToMany;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student1 {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int sid;
	
	private String sname;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "studentCourse",
		joinColumns = {@JoinColumn(name="sid")},
		inverseJoinColumns = {@JoinColumn(name="cid")})
	private Set<Course> courses;
	
	


	int getSid() {
		return sid;
	}


	void setSid(int sid) {
		this.sid = sid;
	}


	String getSname() {
		return sname;
	}


	void setSname(String sname) {
		this.sname = sname;
	}


	Set<Course> getCourses() {
		return courses;
	}


	void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
	
}	
