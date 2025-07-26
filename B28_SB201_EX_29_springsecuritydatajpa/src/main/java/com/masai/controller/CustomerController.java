
package com.masai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Customer;
import com.masai.service.CustomerService;

@RestController
public class CustomerController {
	
	private CustomerService customerSerivce;
	private PasswordEncoder passwordEncoder;
	
	
	


	public CustomerController(CustomerService customerSerivce, PasswordEncoder passwordEncoder) {
		super();
		this.customerSerivce = customerSerivce;
		this.passwordEncoder = passwordEncoder;
	}





	@PostMapping("/customers")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
	{
		String hashedpassword = passwordEncoder.encode(customer.getPassword());
		customer.setPassword(hashedpassword);
		
		Customer addCustomer = customerSerivce.addCustomer(customer);

		return new ResponseEntity<Customer>(addCustomer,HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/logged-in-customer")
	public ResponseEntity<Customer> getLoggedINCustomer()
	{	
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		Customer customer = (Customer)principal;

		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		
	}
}
