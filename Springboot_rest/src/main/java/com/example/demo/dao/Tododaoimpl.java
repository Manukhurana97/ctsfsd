package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Todo;

@Repository
public class Tododaoimpl implements Tododao  {
	
	public List<Todo> lst;
	{
		lst = new ArrayList<Todo>();
		lst.add(new Todo("1", "manu"));
		lst.add(new Todo("2", "saif"));
		lst.add(new Todo("3", "arunC"));
		
	}

	@Override
	public List<Todo> getalltodo() {
		
		return lst;
	}

}
