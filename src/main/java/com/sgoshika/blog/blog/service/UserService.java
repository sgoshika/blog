package com.sgoshika.blog.blog.service;



import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;
import com.sgoshika.blog.blog.model.Blog;

public class UserService {
	MongoClient client = new MongoClient("localhost", 27017);
	Datastore datastore = new Morphia().createDatastore(client, "blog");

	public String addPost(Blog blog) {
		datastore.save(blog);
		return "Add Post Success";
	}

	public List<Blog> getAllPost() {
		List<Blog> list=datastore.find(Blog.class).asList();
		if(list!=null){
			return list;
		}
		return null;
	}
}
