package com.sgoshika.blog.blog;

import com.google.gson.Gson;
import com.sgoshika.blog.blog.model.Blog;
import com.sgoshika.blog.blog.service.UserService;

import static spark.Spark.post;
import static spark.Spark.get;

public class Api {
	private static UserService userService = new UserService();

	public static void main(String[] args) {

		Gson gson = new Gson();
		post("/add-post", (req, res) -> {
			res.type("application/json");
			Blog blog = gson.fromJson(req.body(), Blog.class);
			return userService.addPost(blog);
		}, gson::toJson);

		get("/", (req, res) -> {
			res.type("application/json");
			return userService.getAllPost();
		}, gson::toJson);
	}
}
