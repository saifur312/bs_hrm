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

import com.bs.hrm.entity.Leave;
import com.bs.hrm.service.EmployeeService;
import com.bs.hrm.service.LeaveService;

@Controller
public class LeaveController {
	
	@Autowired LeaveService 		leaveService;
	@Autowired EmployeeService 		employeeService;

	public static final Logger logger = LoggerFactory.getLogger(LeaveController.class);
	
	@GetMapping("/leave-add")
	public String addLeave(Model model) {
		model.addAttribute("leave", new Leave());
		model.addAttribute("allEmployee", employeeService.getAllEmployee());	
		return "leave/leave";
		
	}
	
	@PostMapping("leave-add-save")
	public String addSaveLeave(Model model, Leave leave) {
		logger.info("Form Data\t"+ leave);
		Leave savedLeave = leaveService.addLeave(leave);
		logger.info("after save\t"+ savedLeave);
		return "redirect:/leave-add";
		
	}
	
	@GetMapping("leave-list")
	public String showLeaveList(Model model) {
		return "leave/leave-list";
	}

	@PostMapping("leave-list-find")
	public String finLeave(@RequestBody MultiValueMap<String, String> values, Model model) {
		System.out.println("Values:{}" + values);
		Object findBy = values.getFirst("findBy");
		String findByValue = values.getFirst("findByValue");

		if (findBy.equals("EmployeeId")) {
			model.addAttribute("allLeave",
					leaveService.getLeavesByEmployeeId(Long.parseLong(findByValue)));
		}
		model.addAttribute("show", true);
		return "leave/leave-list";
	}


	@GetMapping("leave-details") 
	public String showLeaveDetails(Model model, @RequestParam Long eid, @RequestParam Long lvid ) {
	  
	  model.addAttribute("leave", leaveService.getLeave(eid, lvid));
		return "leave/leave";
	}

}
