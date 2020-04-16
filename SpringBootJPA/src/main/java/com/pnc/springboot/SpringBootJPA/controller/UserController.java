package com.pnc.springboot.SpringBootJPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pnc.springboot.SpringBootJPA.model.User;
import com.pnc.springboot.SpringBootJPA.service.UserService;

@RestController
@RequestMapping(value="/pnc")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping(value="/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping(value="/user/{id}")
	public Optional<User> getUserByID(@PathVariable("id") String id) {
		return userService.getUserByID(id);
	}
	
	@PostMapping(value="/createuser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PutMapping(value="/updateuser/{id}")
	public User updateUser(@RequestBody User user,@PathVariable("id") String id) {
		return userService.updateUser(user, id);
	}
	
	@DeleteMapping(value="deleteuser/{id}")
	public String deleteUser(@PathVariable("id") String id) {
		return userService.deleteUser(id);
	}
}
