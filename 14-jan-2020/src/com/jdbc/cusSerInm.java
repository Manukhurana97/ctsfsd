package com.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class cusSerInm implements CustomerService{
	
	private customerdaoimp dao;
	{
		dao = new customerdaoimp();
	}
	@Override
	public customer createCuastomer(String name, String email) throws SQLException {
		
		return dao.createcustomer(name, email);
	}
	@Override
	public ResultSet displayall() throws SQLException {
		// TODO Auto-generated method stub
		return dao.displayall();
	}

	
	

}
