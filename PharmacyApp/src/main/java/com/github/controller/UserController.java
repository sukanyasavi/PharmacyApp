package com.github.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.model.Category;
import com.github.model.User;
import com.github.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;


@RequestMapping("/")
	@ResponseBody
public String home() {
		return "good";
	}
	@GetMapping( "/fetchUserList")
	@ResponseBody
	public List<User> getallusers() {
		return userService.getallusers();
	}
	
	@PostMapping("/saveuser")
	@ResponseBody
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@PutMapping("/updateuser")
	@ResponseBody
	public User updateUser(@RequestBody User user) {
		userService.updateUser( user);
		 return user;
	}
		
	@DeleteMapping("/deleteuser/{userId}")
	@ResponseBody
	public void  deleteUser(@PathVariable("userId") long userId) {
			userService.deleteuser(userId);
	
	}

}


