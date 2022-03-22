package com.bs.hrm.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

import com.bs.hrm.entity.BankInfo;
import com.bs.hrm.service.BankInfoService;
import com.bs.hrm.service.EmployeeService;

@Controller
public class BankInfoController {
	@Autowired EmployeeService 		employeeService;
	@Autowired BankInfoService 		bankInfoService;
	
	public static final Logger logger = LoggerFactory.getLogger(BankInfoController.class);

	@GetMapping("bankInfo-add")
	public String addEmpbank(Model m) {
		m.addAttribute("bankInfo", new BankInfo());
		m.addAttribute("allEmployee", employeeService.getAllEmployee());
		return "salary/bankInfo";
		
	}
	
	@PostMapping("bankInfo-add-save")
	public String addSaveEmpbank(Model m, BankInfo bankInfo) {
		logger.info("Form Data\t"+ bankInfo);
		//if(bankInfo.getAccountNo() != null || !bankInfo.getAccountNo().isEmpty())
			bankInfoService.addBankInfo(bankInfo);
		return "redirect:/bankInfo-add";
		
	}

	@GetMapping("bankinfo-list")
	public String showBankInfoList(Model model) {
		return "salary/bankinfo-list";
	}

	@PostMapping("bankinfo-list-find")
	public String finBankInfo(@RequestBody MultiValueMap<String, String> values, Model model) {
		System.out.println("Values:{}" + values);
		Object findBy = values.getFirst("findBy");
		String findByValue = values.getFirst("findByValue");
		System.out.println("After extract\t" + findBy + "\t" + findByValue);

		if (findBy.equals("EmployeeId")) {
			model.addAttribute("bankInfoList",
					bankInfoService.getAllBankInfoByEmployeeId(Long.parseLong(findByValue)));
		}
		model.addAttribute("show", true);
		return "salary/bankinfo-list";
	}


	@GetMapping("bankinfo-details") 
	public String showBankInfoDetails(Model model, @RequestParam Long eid, @RequestParam String accNo ) {
		model.addAttribute("bankInfo", bankInfoService.getBankInfo(eid, accNo)); 
		return "salary/bankInfo"; 
	}

}
