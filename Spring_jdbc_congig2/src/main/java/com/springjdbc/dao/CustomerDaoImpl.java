package com.springjdbc.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbc.model.Customer;
import com.springjdbc.model.CustomerRowMapper;

@Component("dao")
public class CustomerDaoImpl implements Customerdao2 {
	
	private JdbcTemplate jdbctemp;
	
	@Autowired
	public 	void setJdbcTemplate(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	public Customer insertdata(Customer customer)
	{
		String sql = "insert into cusomerjdbc (Name, email, uid) values(?,?,?)";
		jdbctemp.update(sql, new Object[] { customer.getName(), customer.getEmail(), customer.getUid()});
		
		return customer;
	}



	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		String query = "select uid, Name, email from  cusomerjdbc";
		return jdbctemp.query(query, new CustomerRowMapper());
	}

	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException {
		String query = "select uid, Name, email from  cusomerjdbc where email=?";
		
		return jdbctemp.query(query, new Object[] {uId},new CustomerRowMapper());
	}
	
	@Override
	public int deletebyid(String uId) {
		String query = "delete from cusomerjdbc where email=? ";
		int i = jdbctemp.update(query, uId);
		return i;
	}

}
