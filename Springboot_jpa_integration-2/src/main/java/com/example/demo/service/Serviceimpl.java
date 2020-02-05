package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.example.demo.dao.Dao;
import com.example.demo.model.Customer;


@org.springframework.stereotype.Service
@EnableTransactionManagement
public class Serviceimpl implements Service  {
	
	public Dao D;

	@Autowired
	public Serviceimpl(Dao d) {
		super();
		D = d;
	}


	@Override
	@Transactional
	public List<Customer> getAllCustomer() {
		
		return D.findAll();
	}


	@Override
	@Transactional
	public Optional<Customer> findbyId(Integer CustomerId) {
		
		Optional<Customer> cust =  D.findById(CustomerId);
		return cust;
	}


	@Override
	public Customer createCustomer(Customer customer) {
		
		return D.save(customer);
	}
	
	
	
}
