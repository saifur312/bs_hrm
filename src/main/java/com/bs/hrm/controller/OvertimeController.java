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

import com.bs.hrm.dto.EmployeeDto;
import com.bs.hrm.entity.Employee;
import com.bs.hrm.entity.Overtime;
import com.bs.hrm.service.EmployeeService;
import com.bs.hrm.service.OvertimeService;
@Controller
public class OvertimeController {

	/*
	 * @GetMapping("/overtime-add") public String addOvertime(Model model) { return
	 * "overtime";
	 * 
	 * }
	 */
	
	@Autowired OvertimeService 		overtimeService;
	@Autowired EmployeeService 		employeeService;

	public static final Logger logger = LoggerFactory.getLogger(OvertimeController.class);
	
	@GetMapping("/overtime-add")
	public String addOvertime(Model model) {
		model.addAttribute("overtime", new Overtime());
		model.addAttribute("allEmployee", employeeService.getAllEmployee());	
		return "overtime/overtime";
		
	}
	
	@PostMapping("overtime-add-save")
	public String addSaveOvertime(Model model, Overtime overtime) {
		logger.info("Form Data\t"+ overtime);
		Overtime savedOvertime = overtimeService.addOvertime(overtime);
		logger.info("after save\t"+ savedOvertime);
		return "redirect:/overtime-add";
		
	}
	
	@GetMapping("overtime-list")
	public String showOvertimeList(Model model) {
		return "overtime/overtime-list";
	}

	@PostMapping("overtime-list-find")
	public String finOvertime(@RequestBody MultiValueMap<String, String> values, Model model) {
		System.out.println("Values:{}" + values);
		Object findBy = values.getFirst("findBy");
		String findByValue = values.getFirst("findByValue");
		System.out.println("After extract\t" + findBy + "\t" + findByValue);

		if (findBy.equals("EmployeeId")) {
			model.addAttribute("allOvertime",
					overtimeService.getOvertimesByEmployeeId(Long.parseLong(findByValue)));
		}
		model.addAttribute("show", true);
		return "overtime/overtime-list";
	}


	@GetMapping("overtime-details") 
	public String showOvertimeDetails(Model model, @RequestParam Long eid, @RequestParam Long oid ) {
	  
	  model.addAttribute("overtime", overtimeService.getOvertime(eid, oid));
		return "overtime/overtime";
	}
	

}
