package com.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.* ;
import java.util.Properties;

public class Myconnection {
	private Connection con;
	private Statement stmt;
	
	static Myconnection factory = null;
	
	private Myconnection() {}

	static Myconnection getFactoryobj()
	{
		if(factory==null )
		{
			return new Myconnection();
		}
		else
		{
			return factory;
		}
	}
	
	Connection getconnection() throws IOException, SQLException
	{
		InputStream in  = new FileInputStream("database.properties");
		Properties prop = new Properties();
		prop.load(in);
		con = DriverManager.getConnection(prop.getProperty("connection.url"),prop.getProperty("connections.username"),prop.getProperty("connections.password"));
		return con;
		
	}
	

}
