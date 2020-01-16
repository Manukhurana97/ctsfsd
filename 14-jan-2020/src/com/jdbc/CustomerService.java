package com.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface CustomerService {
	public customer createCuastomer(String name,String email) throws SQLException;
	
	public ResultSet displayall()  throws SQLException;

}
