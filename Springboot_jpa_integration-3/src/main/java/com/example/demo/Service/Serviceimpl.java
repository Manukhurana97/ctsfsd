package com.example.demo.Service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.DAO;
import com.example.demo.model.User;
import com.example.demo.shared.SharedUser;

@org.springframework.stereotype.Service
@EnableTransactionManagement
public class Serviceimpl implements Service{

	public DAO D;
	public ModelMapper modelmapper;
	
	{
		modelmapper = new ModelMapper();
		modelmapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	
	@Autowired
	public Serviceimpl(DAO d) {
		super();
		D = d;
	}

	@Override
	@Transactional
	public SharedUser createUser(User user) {
		User temp = D.save(user);
		return modelmapper.map(temp, SharedUser.class);
	}

	@Override
	@Transactional
	public SharedUser findById(Integer id) {
		
		return modelmapper.map(D.findById(id), SharedUser.class);
	}

}
