package com.masai.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.entity.Customer;
import com.masai.repository.CustomerResposity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerDetailService  implements UserDetailsService{
	
	private CustomerResposity customerRespository;
	
	
	
	
	public CustomerDetailService(CustomerResposity customerRespository) {
		super();
		this.customerRespository = customerRespository;
	}




	@Override
	public UserDetails loadUserByUsername(String Email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
	log.info("inside load user by user name of customerdetails service");
		Optional<Customer> customer = customerRespository.findByEmail(Email);
		
		return customer.orElseThrow(()-> new UsernameNotFoundException("no user found with email"+Email));

	}
	

}
