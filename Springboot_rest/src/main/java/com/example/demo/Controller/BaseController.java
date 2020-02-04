package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;

@RestController
@RequestMapping("/todo")
public class BaseController {
	
	private TodoService service;

	@Autowired
	public BaseController(TodoService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("/")
	public List<Todo> getalltodo()
	{
		return service.getalltodo();
	}
	
	
	

}
