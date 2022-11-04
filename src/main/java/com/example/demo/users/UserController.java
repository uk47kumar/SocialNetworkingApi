package com.example.demo.users;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService us;

	@RequestMapping("/user")
	public List<User> getAllUsers() {
		return us.getAllUsers();
	}
	
	@RequestMapping(value="/user/{id}")
	public User getUser(@PathVariable String id) {
		return us.getUser(id);
	}
	
	@PostMapping("/user")
	public String addUser(@RequestBody User user) {
		us.addUser(user);
		return "User added successfully";
	}
	
	@PutMapping("/user/{id}")
	public String updateUser(@PathVariable String id, @RequestBody User user){
		us.updateUser(id, user);
		return "User update successfully";
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable String id) {
		us.deleteUser(id);
		return "User deleted successfully";
	}
}
