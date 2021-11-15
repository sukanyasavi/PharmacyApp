package com.github.service;

import java.util.List;

import com.github.model.User;

public interface UserService {

	List<User> getallusers();

	
	

	User saveUser(User user);




	void deleteuser(long userId);




	void updateUser(User user);




	

	
}
