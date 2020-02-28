package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.User;
import com.example.demo.service.Service;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	public Service ss;
	
	

	public Controller() {
		super();
	}


	@Autowired
	public Controller(Service ss) {
		super();
		this.ss = ss;
	}
	
	
	@PostMapping("/User")
	public User createUser(@RequestBody User user)
	{
		return ss.createuser(user);
	}
	
	
	@GetMapping("/User/All")
	public List<User> findall()
	{
		return ss.findall();
		
	}
	
	@GetMapping("/User/{Userid}")
	public Optional<User> findbyId(@PathVariable Integer Userid)
	{
		return ss.findbyId(Userid);
	}
	
	
	@DeleteMapping("/Userdel")
	public void deleteall()
	{
		ss.deleteall();
		
	}
	
	@GetMapping("/User/{ Useremail }")
	public List<User> findByemail(@PathVariable String Useremail)
	{
		return ss.findByemail(Useremail);
		
	}
	
	

}
