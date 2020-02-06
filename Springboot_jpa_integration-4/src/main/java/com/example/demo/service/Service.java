package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Item;

public interface Service {
	public List<Item> getAlldata();	
	public Item createDate(Item item);
	
	public Optional<Item> findByid(Integer itemid);
	
	public void deleteAll();
	public void deleteById(Integer itemid);
	
	public List<Item> findByitemname(String itemname);
	public List<Item> findByitemnameAndItemid(String itemname, Integer itemid);
	
}
