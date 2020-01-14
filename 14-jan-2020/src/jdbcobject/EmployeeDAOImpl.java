package jdbcobject;

import java.sql.*;
import java.util.ArrayList;
import java.util.*;

public class EmployeeDAOImpl implements employeedao {
	private mysqlconnectionfactory fac;
	private Connection con;
	private Statement stmt;
	List<employee> lst;

	{
		fac = mysqlconnectionfactory.getconobj();
		try {
			con = fac.grtconnection();
			lst = new ArrayList<employee>();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public List<employee> getAllemployees() throws SQLException {
		
		String qry = "create table abc(id int, username varchar(100)";
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(qry);
		String qry1 = "Insert into abc values(1, manu)";
		ResultSet rs1 = stmt.executeQuery(qry1);
		String qry2 = "Insert into abc values(2, arun)";
		ResultSet rs11 = stmt.executeQuery(qry2);
		
		String qry4 = "select * from abc";
		ResultSet rs111 = stmt.executeQuery(qry4);
		
		while(rs111.next())
		{
			System.out.println(rs.getString("username"));
		}
		
		
		
		return lst;
	}

}
