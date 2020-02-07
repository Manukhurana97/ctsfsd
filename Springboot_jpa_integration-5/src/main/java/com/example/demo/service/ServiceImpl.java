package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.Dao;
import com.example.demo.model.Item;

public class ServiceImpl implements Service  {

	public Dao D;

	@Autowired
	public ServiceImpl(Dao d) {
		super();
		D = d;
	}

	@Override
	@Transactional
	public List<Item> getAlldata() {
		
		return D.findAll();
	}

	@Override
	@Transactional
	public Item createData(Item item) {
		
//		item.setDate(LocalDate.now());
		
		return D.insert(item);
	}

	@Override
	public Optional<Item> findByid(Integer itemid) {
		
		return D.findById(itemid);
	}

	@Override
	public void deleteAll() {
		D.deleteAll();
		
	}

	@Override
	public void deleteById(Integer itemid) {
		D.deleteById(itemid);
		
	}

	@Override
	public List<Item> findByitemname(String itemname) {
		
		return D.findByitemname(itemname);
	}

	@Override
	public List<Item> findByitemnameAndItemid(String itemname, Integer itemid) {
		
		return D.findByItemnameAndItemid(itemname, itemid);
	}
	
	
	
}
