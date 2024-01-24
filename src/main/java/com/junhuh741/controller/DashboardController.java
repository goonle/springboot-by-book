package com.junhuh741.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junhuh741.model.dashboard.DashboardService;

@RestController
public class DashboardController {

	@Autowired
	DashboardService svc;
	
	@GetMapping("/getSchedule")
	public void getSchedule() {
		
	}
}
