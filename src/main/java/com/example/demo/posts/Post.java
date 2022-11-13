package com.example.demo.posts;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.users.User;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "post")
public class Post {
	@Id
	private String id;
	private String postdate;
	private String details;
	
	@ManyToOne
	@JsonBackReference
	private User user;
	
	public Post() {
		super();
	}

	public Post(String id, String postdate, String details) {
		super();
		this.id = id;
		this.postdate = postdate;
		this.details = details;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPostdate() {
		return postdate;
	}

	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}


	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
