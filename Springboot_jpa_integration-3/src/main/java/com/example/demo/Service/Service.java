package com.example.demo.Service;

import com.example.demo.model.User;
import com.example.demo.shared.SharedUser;

public interface Service {
	
	public SharedUser createUser(User user);
	public SharedUser findById(Integer id);

}
