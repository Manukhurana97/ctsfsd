package com.springjdbc.Spring_jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import com.springjdbc.Spring_jdbc.model.Customer;

public interface customerdao {
	public  Customer createCustomer(String name, String email) throws SQLException;
	
	public List<Customer> displayall() throws SQLException;

}
