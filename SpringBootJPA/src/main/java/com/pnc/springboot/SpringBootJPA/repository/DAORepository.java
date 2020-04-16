package com.pnc.springboot.SpringBootJPA.repository;

import org.springframework.data.repository.CrudRepository;

import com.pnc.springboot.SpringBootJPA.model.User;

public interface DAORepository extends CrudRepository<User, String>{

}
