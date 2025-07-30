//package com.masai.UniManyToOne;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name= "student")
//public class Student {
//	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Id
//	private Integer Sid;
//	
//	private String name;
//	
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="AID")
//	
//	private Address	 address;
//
//	
//	
//	
//	public Student( String name) {
//		super();
//		
//		this.name = name;
//		
//	}
//
//
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//
//	public Integer getSid() {
//		return Sid;
//	}
//
//
//	public void setSid(Integer sid) {
//		Sid = sid;
//	}
//
//
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public Address getAddress() {
//		return address;
//	}
//
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	
//	
//	
//	
//	
//}
