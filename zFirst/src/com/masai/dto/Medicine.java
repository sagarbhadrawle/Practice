package com.masai.dto;

import java.time.LocalDate;

public class Medicine {
	
	private String med_id;
	private String name;
	private String company;
	private double price_per_unit;
	private LocalDate MfgDate;
	private LocalDate ExpDate;

	public Medicine(String med_id, String name, String company, double price_per_unit, LocalDate mfgDate,
			LocalDate expDate) {
		super();
		this.med_id = med_id;
		this.name = name;
		this.company = company;
		this.price_per_unit = price_per_unit;
		MfgDate = mfgDate;
		ExpDate = expDate;
	}
	@JoinTable(name="empaddress",joinColumns=@joinColumn(name="emp_id"))
	private Set<Address> address = new HashSet<Address>();
	public String getMed_id() {
		return med_id;
	}

	public void setMed_id(String med_id) {
		this.med_id = med_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice_per_unit() {
		return price_per_unit;
	}

	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}

	public LocalDate getMfgDate() {
		return MfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		MfgDate = mfgDate;
	}

	public LocalDate getExpDate() {
		return ExpDate;
	}

	public void setExpDate(LocalDate expDate) {
		ExpDate = expDate;
	}

	@Override
	public String toString() {
		return "Medicine [med_id=" + med_id + ", name=" + name + ", company=" + company + ", price_per_unit="
				+ price_per_unit + ", MfgDate=" + MfgDate + ", ExpDate=" + ExpDate + "]";
	}
	
    	
}
