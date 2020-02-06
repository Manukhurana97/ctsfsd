package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Item {
	@Id
	private int itemid;
	private String itemname;
	private String itemPrice;
	
	public Item(String itemname, String itemPrice) {
		super();
		
		this.itemname = itemname;
		this.itemPrice = itemPrice;
	}
	
	

}
