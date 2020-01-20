package com.springjdbc.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springjdbc.dao.Customerdao2;
import com.springjdbc.model.Customer;

@Component("service")
public class CustomerServiceImpl implements CustomerService{
private Customerdao2 dao;
	
@Autowired
	public CustomerServiceImpl( Customerdao2 dao) 
	{
	
		super();
		this.dao = dao;
		System.out.println("constructor");
	}


	@Override
	public Customer insertdata(Customer cmr) throws SQLException {
		
		return dao.insertdata(cmr);
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {

		return dao.getAllCustomers();
	}


	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException {
		
		return dao.getCustomerById(uId);
	}
	

}
