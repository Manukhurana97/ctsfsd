package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Customer;

public interface Service {
	
	public List<Customer> getAllCustomer();
	public Optional<Customer> findbyId(Integer CustomerId);
	public Customer createCustomer(Customer customer);
}
