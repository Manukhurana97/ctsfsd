package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	
	@Autowired
	
	RestTemplate restTemplate;
	
	@RequestMapping(value="/abc")@ResponseBody
	public Movie[] recommended() {
		Movie[] result = restTemplate.getForObject("http://movie/api/movie/all", Movie[].class);
		return result;
	}
	

}
