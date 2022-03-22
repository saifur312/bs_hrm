package com.bs.hrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SalaryCalculator {
	
	@GetMapping("calculate-monthly-salary.html")
	public String showSalaryCalculator(Model m) {
		
		return "salary/calculate-monthly-salary";
		
	}
	
	@PostMapping("calculate-monthly-salary")
	public String calculateMonthlySalary(Model m, @RequestBody MultiValueMap<String, String> values,
			RedirectAttributes redirectAttrs) {
		String monthValue = values.getFirst("salaryMonth");
		System.out.println("Caught "+ monthValue);
		return "redirect:/calculate-monthly-salary.html";
		
	}

}
