package com.masai.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custId;
	
	private String name;
	
	@Column(unique=true)
	private String email;
	
	@JsonProperty(access  = JsonProperty.Access.WRITE_ONLY)
	private String password;
	
	private String address;
}
