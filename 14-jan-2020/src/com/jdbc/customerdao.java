package com.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface customerdao {

	public customer createcustomer(String name, String email) throws SQLException;
	
	public ResultSet displayall()  throws SQLException;
	
//	public ResultSet findUser(String email) throws SQLException;
}
