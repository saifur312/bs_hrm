package com.bs.hrm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bs.hrm.entity.Address;
import com.bs.hrm.service.AddressService;
import com.bs.hrm.service.CodeOldService;
import com.bs.hrm.service.EmployeeService;

@Controller
public class AddressController {
	
	@Autowired AddressService 		addressService;
	@Autowired EmployeeService 		employeeService;
	@Autowired CodeOldService 			codeOldService;
	
	
	public static final Logger logger = LoggerFactory.getLogger(AddressController.class);
	
	@GetMapping("address-add")
	public String showAddress(Model model) {
		model.addAttribute("address", new Address());
		model.addAttribute("allEmployee", employeeService.getAllEmployee());
		model.addAttribute("allCode", codeOldService.getAllCode());
		return "setup/address/address";
		
	}
	
	@PostMapping("address-add-save")
	public String addSaveAddress(Model model, Address address) {
		System.out.println(address);
		addressService.addAddress(address);
		return "redirect:/address-add";
		
	}
	
	@PostMapping("address-update-save")
	public String updateAddress(Model model, Address address) {
		addressService.updateAddress(address);
		return "redirect:/address-add";
		
	}
	
	

}
