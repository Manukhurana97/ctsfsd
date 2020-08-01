package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import com.example.demo.Model.Myuser;

@RestController
public class Controller {
	
	@Autowired
	public BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	public JdbcUserDetailsManager jdbcUserDetailsManager;
	
	@PostMapping("/Register")
	public String register(@RequestBody Myuser myuser)
	{
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(myuser.getRole()));
		String encodededPassword = passwordEncoder.encode(myuser.getPassword());
		User user = new User(myuser.getUserName(), encodededPassword, authorities);
		jdbcUserDetailsManager.createUser(user);
		
		return "User created";
	}

	@GetMapping("/")
	public String home() 
	{
		return ("<h1>home</h1>");
	}
	
	@GetMapping("/User")
	public String User() 
	{
		return ("<h1>User</h1>");
	}
	
	@GetMapping("/Admin")
	public String Admin() 
	{
		return ("<h1>Admin</h1>");
	}
	
}
