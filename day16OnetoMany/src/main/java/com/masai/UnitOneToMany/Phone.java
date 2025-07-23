package com.masai.UnitOneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pohoneId;
	
	private String phoneType;
	
	private long phoneno;
	private int userId;
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phone( String phoneType, long phoneno) {
		super();
	
		this.phoneType = phoneType;
		this.phoneno = phoneno;
		
	}
	public Integer getPohoneId() {
		return pohoneId;
	}
	public void setPohoneId(Integer pohoneId) {
		this.pohoneId = pohoneId;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	
}
