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

import com.bs.hrm.entity.Loan;
import com.bs.hrm.service.EmployeeService;
import com.bs.hrm.service.LoanService;
@Controller
public class LoanController {

	@Autowired LoanService 			loanService;
	@Autowired EmployeeService 		employeeService;

	public static final Logger logger = LoggerFactory.getLogger(LoanController.class);
	
	@GetMapping("/loan-add")
	public String addLoan(Model model) {
		model.addAttribute("loan", new Loan());
		model.addAttribute("allEmployee", employeeService.getAllEmployee());	
		return "loan/loan";
		
	}
	
	@PostMapping("loan-add-save")
	public String addSaveLoan(Model model, Loan loan) {
		logger.info("Form Data\t"+ loan);
		Loan savedLoan = loanService.addLoan(loan);
		logger.info("after save\t"+ savedLoan);
		return "redirect:/loan-add";
		
	}
	
	@GetMapping("loan-list")
	public String showLoanList(Model model) {
		return "loan/loan-list";
	}

	@PostMapping("loan-list-find")
	public String finLoan(@RequestBody MultiValueMap<String, String> values, Model model) {
		System.out.println("Values:{}" + values);
		Object findBy = values.getFirst("findBy");
		String findByValue = values.getFirst("findByValue");

		if (findBy.equals("EmployeeId")) {
			model.addAttribute("allLoan",
					loanService.getLoansByEmployeeId(Long.parseLong(findByValue)));
		}
		model.addAttribute("show", true);
		return "loan/loan-list";
	}


	@GetMapping("loan-details") 
	public String showLoanDetails(Model model, @RequestParam Long eid, @RequestParam Long lid ) {
	  
	  model.addAttribute("loan", loanService.getLoan(eid, lid));
		return "loan/loan";
	}

}
