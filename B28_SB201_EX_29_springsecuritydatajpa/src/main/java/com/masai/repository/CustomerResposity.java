	package com.masai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.entity.Customer;

public interface CustomerResposity extends JpaRepository<Customer, Integer> {

	Optional<Customer> findByEmail(String email);
	// select c from customer c where c.email =:email 
	
}	
