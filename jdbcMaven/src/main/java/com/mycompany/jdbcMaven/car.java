
package com.mycompany.jdbcMaven;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class car {
	private int id;
	private String name;
	private String price;
	private String model;
	private String cid;
	private int stock;
	public car(String name, String price, String model, String cid, int stock) {
		super();
		
		this.name = name;
		this.price = price;
		this.model = model;
		this.cid = cid;
		this.stock = stock;
		}
	@Override
	public String toString() {
		return "car [id=" + id + ", name=" + name + ", price=" + price + ", model=" + model + ", cid=" + cid
				+ ", stock=" + stock + "]";
	}
	
	

	
	
	
	
	

}
