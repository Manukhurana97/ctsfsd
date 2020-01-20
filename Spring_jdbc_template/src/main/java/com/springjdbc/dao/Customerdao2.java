package com.springjdbc.dao;

import java.sql.SQLException;
import java.util.List;

import com.springjdbc.model.Customer;

public interface Customerdao2 {

	
	public  Customer insertdata(Customer cmr)throws SQLException;
	
	public List<Customer> getAllCustomers()throws SQLException;
	
	public List<Customer> getCustomerById(String uId) throws SQLException;
}
