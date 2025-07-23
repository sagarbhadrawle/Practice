//package com.masai.OneToMany;
//
//import org.hibernate.annotations.ManyToAny;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//
//@Entity
//public class Student {//owned side
//
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int	studentRoll;
//	private String	studentName;
//	private String mobileNumber;
//	private String email;
//	
//	
//	@ManyToOne(fetch =FetchType.LAZY) 
//	@JoinColumn(name = "collage_Id")
//	private Collage collage;
//
//	public Student(String studentName, String mobileNumber, String email, Collage collage) {
//		super();
//		this.studentName = studentName;
//		this.mobileNumber = mobileNumber;
//		this.email = email;
//		this.collage = collage;
//	}
//
//	public Student() {
//			super();
//	}
//
//	public String getStudentName() {
//		return studentName;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//
//	public String getMobileNumber() {
//		return mobileNumber;
//	}
//
//	public void setMobileNumber(String mobileNumber) {
//		this.mobileNumber = mobileNumber;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public Collage getCollage() {
//		return collage;
//	}
//
//	public void setCollage(Collage collage) {
//		this.collage = collage;
//	}
//
//	public int getStudentRoll() {
//		return studentRoll;
//	}	
//		
//	
//	
//}
