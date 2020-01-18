package com.customer.Customer.bean;

import java.util.List;

public interface Customerdao {
	public Customer insertCustomer(String id, String name, String email);

	public List<Customer> displayall();
}
