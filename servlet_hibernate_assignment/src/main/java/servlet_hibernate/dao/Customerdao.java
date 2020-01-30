package servlet_hibernate.dao;

import java.util.List;

import servlet_hibernate.model.Customer;

public interface Customerdao {
	
	public Customer createcustomer(Customer customer);
	
	public List<Customer> displayall();
	
	public Customer findbyid(int id);
	
	public void update(Customer customer);
	
	public void delete(int id);
	

}
