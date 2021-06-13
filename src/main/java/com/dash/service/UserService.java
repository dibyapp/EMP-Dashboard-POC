package com.dash.service;

import java.util.List;
import java.util.Map;

import com.dash.model.User;

public interface UserService {

	public List<User> serachUsers(String keyword);
	
	public Map<String, Integer> getMap();
	
}
