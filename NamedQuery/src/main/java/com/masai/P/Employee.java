package com.masai.P;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name="find by employee by id",
query = "select e from employee e where e.id = :id"
	
)

@NamedNativeQuery( name = "employee.findAllEmployee",
query= "select * from employee ", resultClass = Employee.class)


public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double salary;
	private String deg;
	public Employee(int id, String name, double salary, String deg) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deg = deg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deg=" + deg + "]";
	}
	
	
	
	
	
}
