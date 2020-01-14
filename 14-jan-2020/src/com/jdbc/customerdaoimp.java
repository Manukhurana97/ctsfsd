package com.jdbc;

import java.io.IOException;	
import java.sql.*;

public class customerdaoimp implements customerdao {
	private customer cus;
	private Connection con;
	private PreparedStatement ps;
	private Myconnection mycon;
	
	{
		mycon =Myconnection.getFactoryobj();
		try {
			con = mycon.getconnection();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public customer createcustomer(String name, String email) throws SQLException {
		cus = new customer(name, email);
		ps = con.prepareStatement("insert into monapato(name, email) values (?,?)");
		ps.setString(1, cus.getName());
		ps.setString(2, cus.getEmail());
		ps.executeUpdate();
		return cus;
	}
	

}
