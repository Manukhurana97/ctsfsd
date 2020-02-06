package com.example.demo.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Service;
import com.example.demo.model.User;
import com.example.demo.shared.SharedUser;

@RestController
@RequestMapping("/api")
public class BaseController {
	public Service SS;

	@Autowired
	public BaseController(Service sS) {
		super();
		SS = sS;
	}
	
	
	@GetMapping("/user/{id}")
	public SharedUser find(@PathVariable Integer id)
	{
		return SS.findById(id);
	}
	
	@PostMapping("/user")
	public SharedUser create(@RequestBody User user)
	{
		
		return SS.createUser(user);
	}

}
