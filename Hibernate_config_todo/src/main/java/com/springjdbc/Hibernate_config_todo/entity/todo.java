package com.springjdbc.Hibernate_config_todo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity // Specify class is an entity
@Data // generate getter and setter 
@NoArgsConstructor

public class todo {
	@Id  // Specfy the primary key for entity(database primary key)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int todohibernate;
	@Column(name = "uid") // map columns with database column name
	private String uid;
	@Column( name = "name") // map columns with database column name
	private String name;
	@Column(name = "data") // map columns with database column name
	private LocalDateTime date;
	
	
	
	
	
	

}
