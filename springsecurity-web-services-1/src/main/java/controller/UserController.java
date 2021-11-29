package controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.User;
import services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService user;
	//To get All User
	@GetMapping("/all")
	public List<User> getUser(){
		return  this.user.getAllUsers();
	}
	@GetMapping("/{username}")
	public  User get(@PathVariable String username) {
		return this.user.getUser(username);
	}
	
}