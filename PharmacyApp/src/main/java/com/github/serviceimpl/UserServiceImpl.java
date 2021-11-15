package com.github.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.model.User;

import com.github.repository.UserRepository;
import com.github.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
		@Override
		public List<User> getallusers() {
			return (List<User>) userRepository.findAll();

		}
		@Override
		public User saveUser(User user) {
			// TODO Auto-generated method stub
			return userRepository.save(user);
		}

		@Override
		public void deleteuser(long userId) {
			userRepository.delete(userId);
			
		}

		@Override
		public void updateUser(User user) {
			// TODO Auto-generated method stub
			userRepository.save(user);
		}
		
}
