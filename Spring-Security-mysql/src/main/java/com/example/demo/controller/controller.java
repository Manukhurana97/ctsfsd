package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MyUser;



@RestController
public class controller {
	
	@Autowired
	public JdbcUserDetailsManager jdbcUserDetailsManager;
	
	@Autowired
	public BCryptPasswordEncoder passwordEncoder;
	
	
	@PostMapping(value = "/register-user")
	public String regiter(@RequestBody MyUser myUser) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(myUser.getRole()));
		String encodededPassword = passwordEncoder.encode(myUser.getPassword());
		User user = new User(myUser.getUserName(), encodededPassword, authorities);
		jdbcUserDetailsManager.createUser(user);
		
		return "User created :)";
	}
	
	@GetMapping(value = "/admin")
	public String admin() {
		return "<h3>Welcome Admin :)</h3>";
	}

	@GetMapping(value = "/user")
	public String user() {
		return "<h3>Hello User :)</h3>";
	}

	@GetMapping(value = "/")
	public String welcome() {
		return "<h3>Welcome :)</h3>";
	}

}
