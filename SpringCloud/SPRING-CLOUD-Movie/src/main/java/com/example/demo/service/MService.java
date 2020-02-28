package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Movie;

public interface MService {
	public Movie create(Movie movie);
	public List<Movie> findall();
	public Optional<Movie> findbyId(Integer id);
	public void deleteall();
	
	

}
