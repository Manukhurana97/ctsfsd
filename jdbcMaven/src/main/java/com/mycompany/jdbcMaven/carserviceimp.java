package com.mycompany.jdbcMaven;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class carserviceimp implements carservice {
	
	cardao dao;
	{
		dao = new cardaoimp();
	}

	@Override
	public car insertdata(String name, String price, String model, String cid, int stock) throws SQLException {
		car cr=null;
		System.out.println("ok");
		try {
			cr= dao.insertdata(name, price, model, cid, stock);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cr;
		
	}

	@Override
	public ResultSet displayall() throws SQLException  {
		// TODO Auto-generated method stub
		return dao.displayall();
	}

	@Override
	public car displaybyid(String cid) throws SQLException {
		// TODO Auto-generated method stub
		return dao.displaybyid(cid);
	}

	@Override
	public void deletebyid(String id) throws SQLException {
		dao.deletebyid(id);
		
	}

	@Override
	public void updatebyid(String id , String name, String price, String model, int stock) throws SQLException {
		dao.updatebyid(id, name, price, model, stock);
		
	}

	
	
	
	

}
