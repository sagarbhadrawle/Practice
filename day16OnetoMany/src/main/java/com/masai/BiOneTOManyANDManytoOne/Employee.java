package com.masai.BiOneTOManyANDManytoOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empi;
	
	private String name;
	
	
	@ManyToOne
	@JoinColumn(name="DEPTID")
	private Department deparment;


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name) {
		super();
		this.name = name;
		
	}


	public int getEmpi() {
		return empi;
	}


	public void setEmpi(int empi) {
		this.empi = empi;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Department getDeparment() {
		return deparment;
	}


	public void setDeparment(Department deparment) {
		this.deparment = deparment;
	}
	
	
	
}
