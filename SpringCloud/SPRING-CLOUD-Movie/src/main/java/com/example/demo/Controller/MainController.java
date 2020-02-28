package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Movie;
import com.example.demo.service.MService;

@RestController
@RequestMapping("/api")
public class MainController {
	
	public MService ms;

	public MainController(MService ms) {
		super();
		this.ms = ms;
	}
	
	@PostMapping("/movie")
	public Movie createUser(@RequestBody Movie movie)
	{
		return ms.create(movie);
	}
	
	@GetMapping("/movie/all")
	public List<Movie> findall()
	{
		return ms.findall();
	}
	
	@GetMapping("/movie/{id}")
	public  Optional<Movie> findbyId(Integer id)
	{
		return ms.findbyId(id);
	}
	
	@DeleteMapping("/movie/{id}")
	public void deleteall()
	{
		ms.deleteall();
	}
	
	
	
	
	

}
