package com.bs.hrm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bs.hrm.entity.StatusChange;
import com.bs.hrm.service.EmployeeService;
import com.bs.hrm.service.StatusChangeService;
@Controller
public class StatusChangeController {

	/*
	 * @GetMapping("/statchange-add") public String addStatusChange(Model model) {
	 * return "statchange";
	 * 
	 * }
	 */
	
	@Autowired StatusChangeService 		statchangeService;
	@Autowired EmployeeService 			employeeService;

	public static final Logger logger = LoggerFactory.getLogger(StatusChangeController.class);
	
	@GetMapping("/statchange-add")
	public String addStatusChange(Model model) {
		model.addAttribute("statchange", new StatusChange());
		model.addAttribute("allEmployee", employeeService.getAllEmployee());	
		return "status-change/statchange";
		
	}
	
	@PostMapping("statchange-add-save")
	public String addSaveStatusChange(Model model, StatusChange statchange) {
		logger.info("Form Data\t"+ statchange);
		StatusChange savedStatusChange = statchangeService.addStatusChange(statchange);
		logger.info("after save\t"+ savedStatusChange);
		return "redirect:/statchange-add";
		
	}

}
