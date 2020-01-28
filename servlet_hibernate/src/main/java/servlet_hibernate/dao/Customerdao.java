package servlet_hibernate.dao;

import java.util.List;

import servlet_hibernate.model.Customer;

public interface Customerdao {
	
	public Customer createcustomer(Customer customer);
	
	public List<Customer> displayall();

}
