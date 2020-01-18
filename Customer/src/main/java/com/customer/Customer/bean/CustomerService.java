package com.customer.Customer.bean;

import java.util.List;

public interface CustomerService {


		public Customer insertCustomer(String id, String name, String email);
		
		public List<Customer> displayall();
}
