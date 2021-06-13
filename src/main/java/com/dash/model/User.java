package com.dash.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	public User() {

	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	Date lastPresent;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLastPresent() {
		return lastPresent;
	}
	public void setLastPresent(Date lastPresent) {
		this.lastPresent = lastPresent;
	}
	public User(String name, Date lastPresent) {
		this.name = name;
		this.lastPresent = lastPresent;
	}
	
	
	

}
