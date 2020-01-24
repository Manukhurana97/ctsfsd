package com.springjdbc.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "postby")
	private String postby;
	
	@Column(name = "url")	
	private String url;
	
	@Column(name = "date")
	private LocalDate date;
	
	@OneToMany( cascade = {CascadeType.ALL})
	@JoinColumn(name = "Post_id")
	private List<Comments> lst;

	
	public Post(String postby, String url, LocalDate date) {
		super();
		this.postby = postby;
		this.url = url;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostby() {
		return postby;
	}

	public void setPostby(String postby) {
		this.postby = postby;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<Comments> getLst() {
		return lst;
	}

	public void setLst(List<Comments> lst) {
		this.lst = lst;
	}
	
	public void add(Comments comments)
	{
		if(lst==null)
		{
			lst = new ArrayList<Comments>();
		}
		lst.add(comments);
		
		comments.setPost(this);
	}

	public Post() {
		super();
	}
	
	

}
