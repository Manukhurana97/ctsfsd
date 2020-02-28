package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.User;
import com.example.demo.dao.Userdao;

@EnableTransactionManagement
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	
	@Autowired
	private Userdao dao;
	

	
	@Autowired
	public ServiceImpl() {
		super();
	}

	

	@Override
	public User createuser(User user) {
		// TODO Auto-generated method stub
		return dao.save(user);
	}


	@Override
	public List<User> findall() {
		
		return dao.findAll();
	}







	@Override
	public void deleteall() {
		dao.deleteAll();
		
	}


	@Override
	public List<User> findByemail(@PathVariable String email) {
		return dao.findByemail(email);
	}


	@Override
	public Optional<User> findbyId(Integer Userid) {
		return dao.findById(Userid);
	}



	@Override
	public void deletebyid(Integer UserId) {
		// TODO Auto-generated method stub
		
	}





	

}
