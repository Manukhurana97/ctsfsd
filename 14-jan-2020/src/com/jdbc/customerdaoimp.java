package com.jdbc;

import java.io.IOException;	
import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class customerdaoimp implements customerdao {
	private customer cus;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
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


	@Override
	public ResultSet displayall() throws SQLException {
		ps = con.prepareStatement("select name, email from monapato");
		rs = ps.executeQuery();
		
		return rs;
	}

//
//	@Override
//	public ResultSet findUser() throws SQLException {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

}
