package com.example.demo.Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Dao;
import com.example.demo.model.Item;

@RestController
@RequestMapping("/api")
public class Controller {
	
	public Dao D;

	@Autowired
	public Controller(Dao d) {
		super();
		D = d;
	}
	
	@PostMapping("/insert_item")
	public Item createData(@RequestBody Item item)
	{
		item.setDate(LocalDate.now());
		return D.insert(item);
	}
	
	@GetMapping("/items")
	public List<Item> getAlldata()
	{
		return D.findAll();
	}
	
	
	
	@GetMapping("/item/{itemid}")
	public Optional<Item> findByid(@PathVariable Integer itemid) {
		
		return D.findById(itemid);
	}
	
	@DeleteMapping("/deleteall")
	public void deleteAll() {
		D.deleteAll();
		
	}
	
	@DeleteMapping("/delete/{itemid}")
	public void deleteById(@PathVariable Integer itemid) {
		D.deleteById(itemid);
		
	}
	
	@GetMapping("/itemname/{itemname}")
	public List<Item> findByitemname(@PathVariable String itemname) {
		
		return D.findByitemname(itemname);
	}
	
	@GetMapping("/itemname/{itemname}/{itemid}")
	public List<Item> findByitemnameAndItemid(@PathVariable String itemname, @PathVariable Integer itemid) {
		
		return D.findByItemnameAndItemid(itemname, itemid);
	}
}
