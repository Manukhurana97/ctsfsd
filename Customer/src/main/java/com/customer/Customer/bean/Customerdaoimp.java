package com.customer.Customer.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Customerdaoimp implements Customerdao {
	List<Customer> lst;
	Customer cst;

	@Override
	public Customer insertCustomer(String id, String name, String email) {
		cst.setId(id);
		cst.setName(name);
		cst.setEmail(email);
		lst.add(cst);
		return cst;
	}

	@Override
	public List<Customer> displayall() {
	
		return lst;
	}
	
	
	

}
