package com.masai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		return new ResponseEntity<String>("All is well",HttpStatus.OK);
	}
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello()
	{
		return new ResponseEntity<String>("hello: all is well",HttpStatus.OK);
	}
	
}
