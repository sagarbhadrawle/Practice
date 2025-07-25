package com.masai;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor 
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
// @Data
public class EmployeeLombok {
	
	@ToString.Exclude private Integer id;
	@EqualsAndHashCode.Exclude private String name;
	@EqualsAndHashCode.Exclude private double packageILpa;
	
	private String state;
	
	@EqualsAndHashCode.Exclude private List<String> hobbies;

	public EmployeeLombok(String name, double packageILpa, String state, List<String> hobbies) {
		super();
		this.name = name;
		this.packageILpa = packageILpa;
		this.state = state;
		this.hobbies = hobbies;
	}
	
	
	
	
}
