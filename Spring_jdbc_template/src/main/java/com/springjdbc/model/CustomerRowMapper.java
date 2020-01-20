package com.springjdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper  implements RowMapper<Customer>


{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer cmr = new Customer();
		cmr.setName(rs.getString("Name"));
		cmr.setEmail(rs.getString("email"));
		cmr.setUid(rs.getString("uid"));
		
		
		return cmr;
	}

}
	