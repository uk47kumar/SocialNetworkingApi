package com.example.demo.locations;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.users.User;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "location")
public class Location {
	@Id
	private String id;
	private String name;

	@ManyToOne
	@JsonBackReference
	private User user;
	
	

	public Location() {
		super();
	}

	public Location(String id, String name, User user) {
		this.id = id;
		this.name = name;
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
