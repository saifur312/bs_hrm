package com.bs.hrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

	@GetMapping("/")
	public String showDashboard() {
		return "menuboard/dashboard";
		
	}

}
