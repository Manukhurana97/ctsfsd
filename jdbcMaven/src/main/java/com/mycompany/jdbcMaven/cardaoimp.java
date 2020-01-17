package com.mycompany.jdbcMaven;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class cardaoimp implements cardao {
	car cr;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private MYconnection mycon;

	
	{
		
		try {
			mycon = MYconnection.getobj();
			
			con = mycon.getconn();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

	@Override
	public car insertdata(String name, String price, String model, String cid, int stock) throws SQLException {
		
		cr = new car(name, price, model, cid, stock);
		String query = "insert into car(name, price, model,carid, stock) values (?,?,?,?,?)";
		ps = con.prepareStatement(query);
		ps.setString(1, cr.getName());
		ps.setString(2, cr.getPrice());
		ps.setString(3, cr.getModel());
		ps.setString(4, cr.getCid());
		ps.setInt(5, cr.getStock());
		ps.executeUpdate();
		return cr;
	}




	@Override
	public ResultSet displayall() throws SQLException {
		ps = con.prepareStatement("Select name, price, model, carid, stock from car;");
		rs = ps.executeQuery();
		return rs;
	}




	@Override
	public car displaybyid(String cid) throws SQLException {
		car cr1 = null;
		
		try {
		ps = con.prepareStatement("Select name, price, model, carid, stock from car where carid=?;");
		ps.setString(1, cid);
		rs = ps.executeQuery();
		while(rs.next())
		{
			cr1 = new car(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getInt(5));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return cr1;
	}




	@Override
	public void deletebyid(String id) throws SQLException {
		PreparedStatement ps1 = con.prepareStatement("delete from car where carid=?");
		ps1.setString(1, id);
		ps1.executeUpdate();
		System.out.println("deleted Successfully: ");
	}
		
	
	@Override
	public void updatebyid(String id, String name, String price, String model, int stock) throws SQLException {
		cr = new car(name, price, model, id, stock);
		PreparedStatement ps1 = con.prepareStatement("update car set name=?, price=?, model=?, stock=? where carid =? ");
		
		ps1.setString(1, name);
		ps1.setString(2, price);
		ps1.setString(3, model);
		ps1.setString(4, id);
		ps1.setInt(5, stock);
		ps1.executeUpdate();
		System.out.println("updated  Successfully: ");
	
}




	




	








	
	
	
	

}
