package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Tododao;
import com.example.demo.model.Todo;

@Service
public class Todoserviceimpl implements TodoService {
	Tododao dao;
	

	@Autowired
	public Todoserviceimpl(Tododao dao) {
		super();
		this.dao = dao;
	}


	@Override
	public List<Todo> getalltodo() {
		
		return dao.getalltodo();
	}
	

}
