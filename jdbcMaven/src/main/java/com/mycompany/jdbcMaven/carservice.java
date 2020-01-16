package com.mycompany.jdbcMaven;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface carservice {
	
	car insertdata(String name, String price, String model, String cid) throws SQLException;
	
	public ResultSet displayall() throws SQLException;
	 
	 public car displaybyid(String cid) throws SQLException;
	 
	 void deletebyid (String id) throws SQLException;
	 

	void updatebyid(String id, String name, String price, String model) throws SQLException;
	 

}
