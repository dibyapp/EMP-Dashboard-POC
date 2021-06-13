package com.dash.controller;

import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dash.repository.UserRepository;
import com.dash.service.UserServiceImpl;

@Controller
public class EmployeeController {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private UserServiceImpl service;

	@GetMapping("dashboard")
	public String getDashboard(Model model)
	{	
		TreeMap<String, Integer> sorted = new TreeMap<>();
		sorted.putAll(service.getMap());
		model.addAttribute("emps", sorted);
		return "dashboard";
	}
	
	@GetMapping("search")
	public String searchEmp(Model model,  @RequestParam("q") String query) {
		model.addAttribute("list", repo.searchUsers(query));
		return "search";
	}
}

