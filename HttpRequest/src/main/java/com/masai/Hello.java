package com.masai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	
	@GetMapping(value="/hello")
	public String getMessage()
	{
		return "Hello_ Masai";
	}
	
	
}
