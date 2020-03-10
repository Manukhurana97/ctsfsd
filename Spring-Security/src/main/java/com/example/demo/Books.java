package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Books {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private String name;
		
		private String author;
		
		private Double price;

		public Books() {
			super();
		}

		
		public Books(String name, String author,Double price) {
			super();
			this.name = name;
			this.author = author;
			this.price = price;
		}
		
		public Books(Long id, String name, String author,Double price) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.price = price;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}
		
		
		
		
		
		
		
		
}
