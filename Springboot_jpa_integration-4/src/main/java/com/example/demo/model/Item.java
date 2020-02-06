package com.example.demo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;

@Document
@Data
public class Item {
	@Id
	private int itemid;
	private String itemname;
	private String itemPrice;
	@JsonFormat(shape = Shape.STRING, pattern = "dd-MM-YYYY")
	private LocalDate date;
	
	public Item(String itemname, String itemPrice) {
		super();
		
		this.itemname = itemname;
		this.itemPrice = itemPrice;
	}


	

}
