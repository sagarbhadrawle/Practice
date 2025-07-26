package com.masai.service;

import org.springframework.stereotype.Service;

import com.masai.entity.Customer;
import com.masai.repository.CustomerResposity;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerResposity customerrepostResposity;
	
	
	
	public CustomerServiceImpl(CustomerResposity customerrepostResposity) {
		super();
		this.customerrepostResposity = customerrepostResposity;
	}



	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerrepostResposity.save(customer);
	}

}
