package com.pnc.springboot.SpringBootJPA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@Column(name="PLID")
	private String plId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LOCATION")
	private String location;
	
	public User() {
		super();
	}

	public User(String plId, String name, String location) {
		this.plId = plId;
		this.name = name;
		this.location = location;
	}
	
	public String getPlId() {
		return plId;
	}
	public void setPlId(String plId) {
		this.plId = plId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "User [plId=" + plId + ", name=" + name + ", location=" + location + "]";
	}
	
}
