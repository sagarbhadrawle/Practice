package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.repository.CustomerRespository;

@Service
public class CustomerServiceImple implements CustomerService {

	
	@Autowired
	private CustomerRespository customerRespository;
	
	@Override
	public Customer registerCustomer(Customer customer) {

		
		return customerRespository.save(customer);
	}

	@Override
	public Customer getCustomerDetailsByEmail(String email) throws CustomerException {
		// TODO Auto-generated method stub
		return  customerRespository.findByEmail(email).orElseThrow(() -> new CustomerException("customer not found with email"));
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		// TODO Auto-generated method stub
		List<Customer> customers = customerRespository.findAll();
		
		if(customers.isEmpty())
			throw new CustomerException("No customer found");
		return customers;
	}

}
