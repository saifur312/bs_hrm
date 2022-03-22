package com.bs.hrm.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bs.hrm.entity.Department;
import com.bs.hrm.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired DepartmentService departmentService;
	
	@GetMapping("department-add")
	public String showDepartment(Model model) {
		model.addAttribute("department", new Department()).addAttribute("detail", false);
		return "setup/department/department";
		
	}
	
	@PostMapping("department-add-save")
	public String addDepartment(Model model, Department depatment) {
		System.out.println(depatment);
		departmentService.addDepartment(depatment);
		return "redirect:/department-add";
		
	}
	
	@PostMapping("department-update-save")
	public String updateDepartment(Model model, Department depatment) {
		departmentService.updateDepartment(depatment);
		return "redirect:/department-add";
		
	}
	
	
	@GetMapping("/dept-list.html")
	public String showDepartmentList(Model model) {
		model.addAttribute("deptList", departmentService.getAllDepartment());
		return "setup/department/dept-list";
	}
	
	@GetMapping("dept-details") 
	public String showDepartmentDetails(Model  model, @RequestParam Integer id) {
		  model.addAttribute("department", departmentService.getDepartment(id))
		  	.addAttribute("detail", true); 
		  return "setup/department/department"; 
	}

}
