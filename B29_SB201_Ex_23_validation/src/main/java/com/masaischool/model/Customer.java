package com.masaischool.model;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Pattern.Flag;

public class Customer {
	
	@Min(value =1, message = "id must e a +ve integer")
	@NotNull(message = "Customer id must not be null")
	private Integer id;
	
	@NotBlank(message ="you must provide the customer name")
	private String name;
	
	@PastOrPresent(message = "last puchase date must not e of fututre")
	private LocalDate lastPurchaseDate;
	
	
	@NotBlank(message = "you must provide the customer eamil")
	@Pattern(regexp = "[a-z0-9.]+@[a-z0-9.]+\\\\.[a-z]{2,3}",flags = Flag.CASE_INSENSITIVE,message="Invalid email id")
	
	private String email;
	
	@Pattern(regexp = "[6-9][0-9]{9}",message = "Invalid mobile no")
	private String mobile;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(
			Integer id,
			String name,
			 LocalDate lastPurchaseDate,
			 String email,
			 String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.lastPurchaseDate = lastPurchaseDate;
		this.email = email;
		this.mobile = mobile;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getLastPurchaseDate() {
		return lastPurchaseDate;
	}

	public void setLastPurchaseDate(LocalDate lastPurchaseDate) {
		this.lastPurchaseDate = lastPurchaseDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
}
