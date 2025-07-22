package com.masai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		
		SecurityContext sc =  SecurityContextHolder.getContext();
		
		Authentication authentication = sc.getAuthentication();
		Object principal = authentication.getPrincipal();
		User us =(User)principal;
		System.out.println(us.getUsername());
		System.out.println(us.getUsername());
		
		return new ResponseEntity<String>("All is well",HttpStatus.OK);
	}
	
	@PutMapping("/hello")
	public ResponseEntity<String> hello()
	{
		return new ResponseEntity<String>("hello: all is well",HttpStatus.OK);
	}
	
	@GetMapping("/signIn")
	public ResponseEntity<String> user()
	{
		return new ResponseEntity<String>("user: all is well",HttpStatus.OK);
	}
	
}
