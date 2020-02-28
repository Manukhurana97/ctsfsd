package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.User;

public interface Service {
	
	public User createuser(User user);
	public List<User> findall();
	public Optional<User> findbyId(Integer Userid);
	public void deleteall();
	public void deletebyid(Integer UserId); 
	public List<User> findByemail(String email);

}
