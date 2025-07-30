package com.masai.OneToManyUNi;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Collage {//refernce side
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int	collageId;
	private String	collageName;
	private String	collageAddress;
	
	@OneToMany(mappedBy = "collage",cascade = CascadeType.ALL)
	private Set<Student> student;

	public Collage(String collageName, String collageAddress) {
		super();
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		
		
	}
	


	public Collage() {
		// TODO Auto-generated constructor stub
	}

	public Collage(String collageName, String collageAddress, Set<Student> student) {
		super();
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		this.student = student;
	}



	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public String getCollageAddress() {
		return collageAddress;
	}

	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public int getCollageId() {
		return collageId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Collage other = (Collage) obj;
		return Objects.equals(student, other.student);
	}	
	
	
	
}
