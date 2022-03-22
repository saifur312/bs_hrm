package com.bs.hrm.controller;

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

import com.bs.hrm.entity.Deduction;
import com.bs.hrm.service.DeductionService;
import com.bs.hrm.service.EmployeeService;

@Controller
public class DeductionController {
	
	@Autowired EmployeeService 		employeeService;
	@Autowired DeductionService 	deductionService;
		
	private static final Logger logger = LoggerFactory.getLogger(DeductionController.class);
	
	@GetMapping("deduction-add")
	public String addDeduction(Model m) {
		m.addAttribute("deduction", new Deduction());
		m.addAttribute("allEmployee", employeeService.getAllEmployee());
		return "salary/deduction";
		
	}
	
	@PostMapping("deduction-add-save")
	public String addSaveDeduction(Model m, Deduction deduction) {
		logger.info("Form Data\t" +  deduction);
		deductionService.addDeduction(deduction);
		return "redirect:/deduction-add";
		
	}

	@GetMapping("deduction-list")
	public String showDeductionList(Model model) {
		return "salary/deduction-list";
	}

	@PostMapping("deduction-list-find")
	public String finDeduction(@RequestBody MultiValueMap<String, String> values, Model model) {
		System.out.println("Values:{}" + values);
		Object findBy = values.getFirst("findBy");
		String findByValue = values.getFirst("findByValue");
		//System.out.println("After extract\t" + findBy + "\t" + findByValue);

		if (findBy.equals("EmployeeId")) {
			model.addAttribute("deductionList",
					deductionService.getAllDeductionByEmployeeId(Long.parseLong(findByValue)));
		}
		model.addAttribute("show", true);
		return "salary/deduction-list";
	}


	@GetMapping("deduction-details") 
	public String showDeductionDetails(Model model, @RequestParam Long eid, @RequestParam Long dedid ) {
		model.addAttribute("deduction", deductionService.getDeduction(eid, dedid)); 
		return "salary/deduction"; 
	}

}
