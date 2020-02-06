package com.example.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Item;

@Repository
public interface Dao extends MongoRepository<Item, Integer> {
	public List<Item> findByitemname(String itemname);
	public List<Item> findByItemnameAndItemid(String itemname, Integer itemid);

}
