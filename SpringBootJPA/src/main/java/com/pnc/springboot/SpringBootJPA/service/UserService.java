package com.pnc.springboot.SpringBootJPA.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pnc.springboot.SpringBootJPA.model.User;
import com.pnc.springboot.SpringBootJPA.repository.DAORepository;

@Service
public class UserService {
	
	@Autowired
	DAORepository repository;
	
	public List<User> getAllUsers(){
		List<User> userslist = new ArrayList<>();
		Iterable<User> userlist = repository.findAll();
		Iterator<User> userit = userlist.iterator();
		while(userit.hasNext()) {
			User user = userit.next();
			userslist.add(user);
		}
		return userslist;
	}
	
	public Optional<User> getUserByID(String id) {
		return repository.findById(id);
	}
	
	public User createUser(User user) {
		return repository.save(user);
	}
	
	public User updateUser(User user, String id) {
		Optional<User> user1 = repository.findById(id);
		user1.get().setPlId(user.getPlId());
		user1.get().setName(user.getName());
		user1.get().setLocation(user.getLocation());
		return repository.save(user1.get());
	}
	
	public String deleteUser(String id) {
		repository.deleteById(id);
		return "User deleted successfully...";
	}
	
}
