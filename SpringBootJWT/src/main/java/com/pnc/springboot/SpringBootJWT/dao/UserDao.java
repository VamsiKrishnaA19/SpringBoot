package com.pnc.springboot.SpringBootJWT.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pnc.springboot.SpringBootJWT.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer>{
	DAOUser findByUsername(String userName);
}
