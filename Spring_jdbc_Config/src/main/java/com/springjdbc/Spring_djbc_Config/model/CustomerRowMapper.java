package com.springjdbc.Spring_djbc_Config.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer>{

	
	
	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer cr = new Customer();
		cr.setName(rs.getString("uid"));
		cr.setName(rs.getString("Name"));
		cr.setName(rs.getString("email"));
		
		
		return cr;
	}
	

}
