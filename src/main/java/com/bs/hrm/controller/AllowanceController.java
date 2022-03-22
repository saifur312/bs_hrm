package com.bs.hrm.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.bs.hrm.entity.Allowance;
import com.bs.hrm.service.AllowanceService;
import com.bs.hrm.service.EmployeeService;

@Controller
public class AllowanceController {

	@Autowired EmployeeService 		employeeService;
	@Autowired AllowanceService 	allowanceService;
	
	private static final Logger logger = LoggerFactory.getLogger(AllowanceController.class);
	
	@GetMapping("allowance-add")
	public String addAllowance(Model m) {
		m.addAttribute("allowance", new Allowance());
		m.addAttribute("allEmployee", employeeService.getAllEmployee());
		
		//Unit Testing
		/*
		 * Allowance Allowance1 = new Allowance(1l, 1l, new BigDecimal("20000"), new
		 * BigDecimal("100.45"), new BigDecimal("20000"), new BigDecimal("20000"), new
		 * BigDecimal("20000"), new BigDecimal("20000"), new BigDecimal("20000"), new
		 * BigDecimal("20000"), new BigDecimal("20000"), new BigDecimal("20000"), null,
		 * null, null, null, null, null, null, null, null, null, null);
		 * allowanceService.addAllowance(Allowance1);
		 */
		
		return "salary/allowance";
		
	}
	
	@PostMapping("allowance-add-save")
	public String addSaveAllowance(Model m, Allowance allowance) {
		logger.info("Form Data\t" +  allowance);
		allowanceService.addAllowance(allowance);
		return "redirect:/allowance-add";
		
	}

	@GetMapping("allowance-list")
	public String showAllowanceList(Model model) {
		return "salary/allowance-list";
	}

	@PostMapping("allowance-list-find")
	public String finAllowance(@RequestBody MultiValueMap<String, String> values, Model model) {
		System.out.println("Values:{}" + values);
		Object findBy = values.getFirst("findBy");
		String findByValue = values.getFirst("findByValue");
		//System.out.println("After extract\t" + findBy + "\t" + findByValue);

		if (findBy.equals("EmployeeId")) {
			model.addAttribute("allowanceList",
					allowanceService.getAllowanceByEmployeeId(Long.parseLong(findByValue)));
		}
		model.addAttribute("show", true);
		return "salary/allowance-list";
	}


	@GetMapping("allowance-details") 
	public String showAllowanceDetails(Model model, @RequestParam Long eid, @RequestParam Long alwid ) {
		model.addAttribute("allowance", allowanceService.getAllowance(eid, alwid)); 
		return "salary/allowance"; 
	}

}
