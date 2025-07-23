package com.masai.UnitOneToMany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class User1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	
	private String email;
	private String username;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="phoneTables")
	private List<Phone> phoneTables;

	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User1(String email, String username) {
		super();
		this.email = email;
		this.username = username;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Phone> getPhoneTables() {
		return phoneTables;
	}

	public void setPhoneTables(List<Phone> phoneTables) {
		this.phoneTables = phoneTables;
	}
	
	
}
