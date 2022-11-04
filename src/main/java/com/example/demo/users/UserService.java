package com.example.demo.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserReopository userReopository;	
	
	public List<User> getAllUsers() {
		return userReopository.findAll();
	}
	
	public User getUser(String id) {
		return userReopository.getOne(id);
	}
	
	public User addUser(User user) {
		userReopository.save(user);
		return user;
	}
	
	public void updateUser(String id, User user) {
		userReopository.save(user);
	}
	
	public void deleteUser(String id) {
		userReopository.deleteById(id);
	}
}
