package jdbcobject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysqlconnectionfactory {
	
	private Connection con;
	static mysqlconnectionfactory mqsqlcf;
	
	private mysqlconnectionfactory(){}

	public static mysqlconnectionfactory getconobj() {
		if(mqsqlcf==null) {
			return new mysqlconnectionfactory();
		}
		else {
			return mqsqlcf;
		}
		
	}
	
	public Connection grtconnection() throws SQLException
	{
		return con = DriverManager.getConnection("jdbc:mysql:///hr", "root","manu2462");
	}

}
