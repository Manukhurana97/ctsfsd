package com.customer.Customer.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor

public class Customerseviceimpl implements CustomerService {

	
	Customerdao dao;
	@Override
	public Customer insertCustomer(String id, String name, String email) {
		
		
		return dao.insertCustomer(id, name, email);
	}
	@Override
	public List<Customer> displayall() {
		
		return dao.displayall();
	}

}
