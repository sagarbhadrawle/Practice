package com.masaischool.B28_SB201_Ex_24.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="st")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roll;
	
	@Column(nullable = false ,unique=true)
	private String name;
	private Integer Marks;
	
	@CreationTimestamp
	@Column(name = "creation_date" , updatable = false)
	private LocalDateTime creationDate;
	
	
	@UpdateTimestamp
	@Column(name = "last_modified_date", insertable = false)
	private LocalDateTime lastModifiedDate;


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, Integer marks) {
		super();
		this.name = name;
		Marks = marks;
	}


	public Integer getRoll() {
		return roll;
	}


	public void setRoll(Integer roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getMarks() {
		return Marks;
	}


	public void setMarks(Integer marks) {
		Marks = marks;
	}
	
	
	
	
	
	
	
	
	
}