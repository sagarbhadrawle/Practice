package com.masai.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.masai.exception.GlobalExceptionHandler;
import com.masai.model.Customer;
import com.masai.service.CustomerService;

@RestController
public class CustomerController {

    private final GlobalExceptionHandler globalExceptionHandler;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;


    CustomerController(GlobalExceptionHandler globalExceptionHandler) {
        this.globalExceptionHandler = globalExceptionHandler;
    }		
	
	
	@GetMapping("/hello")
	public String testHandler()
	{
		return "welcome to spring security";
	}
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> saveCustomerHandler(@RequestBody Customer customer){
		
		customer.setPassword(passwordEncoder.encode(customer.getPassword()));
		
		Customer registeredCustomer = customerService.registerCustomer(customer);
		
		return new ResponseEntity<>(registeredCustomer, HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/customers/{email}")
	public ResponseEntity<Customer> getCustomerByEmailHandler(@PathVariable("email") String email)
	{
		
		Customer customer = customerService.getCustomerDetailsByEmail(email);
		
		return new ResponseEntity<>(customer, HttpStatus.ACCEPTED);
		
		
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomerHandler()
	{
		List<Customer> customer = customerService.getAllCustomerDetails();
		return new ResponseEntity<>(customer,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/signIn")
	public ResponseEntity<String> getLoggedInCustomerDetailsHandler(Authentication auth)
	{
		System.out.println(auth);
		
//		Customer customer =(Customer)auth.getPrincipal();
		
		Customer customer = customerService.getCustomerDetailsByEmail(auth.getName());
		
		return new ResponseEntity<>(customer.getName()+"Logged In Successfully",HttpStatus.ACCEPTED);
	}
	
	
	
	
}
