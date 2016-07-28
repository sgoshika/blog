package com.sgoshika.blog.blog.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Blog {
	@Id
	private ObjectId id;
	private String title;
	private String description;
	private String auth;
	private Address address;

	public Blog() {
	}

	public Blog(ObjectId id, String title, String description, String auth) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.auth = auth;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

}
