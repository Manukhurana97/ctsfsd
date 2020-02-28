package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.Movie;
import com.example.demo.dao.Moviedao;

@EnableTransactionManagement
@org.springframework.stereotype.Service
@EnableZuulProxy  // enable zuul
public class Serviceimpl implements MService  {
	
	@Autowired
	public  Moviedao dao;
	
	@Autowired
	public Serviceimpl(Moviedao dao) {
		super();
		this.dao = dao;
	}

	
	
	
	
	@Override
	public Movie create(Movie movie) {
		
		return dao.save(movie);
	}

	@Override
	public List<Movie> findall() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<Movie> findbyId(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public void deleteall() {
		dao.deleteAll();
		
	}

}
