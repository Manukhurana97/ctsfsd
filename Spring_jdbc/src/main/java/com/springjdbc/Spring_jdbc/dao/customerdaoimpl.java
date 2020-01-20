package com.springjdbc.Spring_jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.cj.protocol.Resultset;
import com.springjdbc.Spring_jdbc.model.Customer;

@Component("dao") // creating bean
public class customerdaoimpl implements customerdao {
	
	private DataSource datasrc;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	List<Customer> lst;
	{
		lst = new ArrayList<Customer>();
	}
	
	
	private static Logger logger=Logger.getLogger("com.mycompany.springjdbcdemo.dao.CustomerDaoImpl");
	
	Customer customer;
	
	@Autowired
	public customerdaoimpl(DataSource datasrc)
	{
		super();
		this.datasrc = datasrc;
	}
	
	@PostConstruct
	public void init()
	{
		try {
			con = datasrc.getConnection();
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
	}
	

	@Override
	public Customer createCustomer(String name, String email) throws SQLException {
		ps = con.prepareStatement("insert into customer (name, email) values(?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.executeUpdate();
		return customer ;
	}

	@Override
	public List<Customer> displayall() throws SQLException {
		ps = con.prepareStatement("select name , email from customer");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			customer = new Customer(rs.getString("name"), rs.getString("email"));
			
			lst.add(customer);
			
		}
		return lst;
	}

	

}
