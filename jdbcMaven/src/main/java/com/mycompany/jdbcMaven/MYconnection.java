package com.mycompany.jdbcMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.*;

public class MYconnection {
	Connection con;
	Statement stmnt;
	
	static MYconnection mycon = null;
	
	private MYconnection(){}
	
	static MYconnection getobj(){
		if(mycon==null) {
			mycon= new MYconnection();
			
		}
		return mycon;
		
	}
	
	Connection getconn() throws IOException, SQLException
	{
		FileInputStream fis = new FileInputStream("car.properties");
		Properties prop = new Properties();
		prop.load(fis);
		con = DriverManager.getConnection(prop.getProperty("connection.url"), prop.getProperty("connections.username"), prop.getProperty("connections.password"));
		System.out.println(con);
		return con;
		
		
		
	}

}
