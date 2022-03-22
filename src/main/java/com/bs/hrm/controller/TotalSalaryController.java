package com.bs.hrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bs.hrm.repos.TotalSalaryRepo;
import com.bs.hrm.service.DepartmentService;
import com.bs.hrm.service.TotalSalaryService;

@Controller
public class TotalSalaryController {
	
	@Autowired TotalSalaryService totalSalaryService;
	@Autowired DepartmentService departmentService;
	@Autowired TotalSalaryRepo totalSalaryRepo;
	
	@GetMapping("total-salary.html")
	public String showTotalSalary(Model model) {
		model.addAttribute("departmentList", departmentService.getAllDepartment());
		return "salary/total-salary/total-salary.html";
	}
	
	@PostMapping("show-total-salary") 
	public String showSelectedTotalSalary(Model model, @RequestBody MultiValueMap<String, String> values, 
			RedirectAttributes redirectAttrs) { 
		System.out.println("Call success");
		System.out.println("Values: " + values);
		String findBy		=	values.getFirst("findBy");
        String findByValue	=	values.getFirst("findByValue");
        String employeeType	=	values.getFirst("employeeType");
        String department		=	values.getFirst("department");
		System.out.println("After extract\t" + findBy + "\t" + findByValue + 
				"\t" + employeeType + "\t" + department);

		Integer year = 0, month=0;
		if(findBy.equalsIgnoreCase("Year")) {
			year = Integer.parseInt(findByValue);
			redirectAttrs.addFlashAttribute("totalSalaryList", totalSalaryService.getTotalSalaryByYear(year));
		}
		else if(findBy.equalsIgnoreCase("BSMonth")) {
			String[] parts = findByValue.split(" ");
			String yearPart = parts[0]; 
			String monthPart = parts[1];

			year = Integer.parseInt(yearPart);
			switch (monthPart) {
			case "Jan":
				month = 1;
				break;
			case "Feb":
				month = 2;
				break;
			case "Mar":
				month = 3;
				break;
			case "Apr":
				month = 4;
				break;
			case "May":
				month = 5;
				break;
			case "Jun":
				month = 6;
				break;
			default:
				break;
			}
			redirectAttrs.addFlashAttribute("totalSalaryList", 
					totalSalaryService.getTotalSalaryByYearAndMonth(year, month));
		}
		else if(findBy.equalsIgnoreCase("Employee Type")) {
			redirectAttrs.addFlashAttribute("totalSalaryList", totalSalaryService.getTotalSalaryByEmployeeType(employeeType));
		}
		else if(findBy.equalsIgnoreCase("Department")) {
			Integer departmentId = Integer.parseInt(department);
			redirectAttrs.addFlashAttribute("totalSalaryList", totalSalaryService.getTotalSalaryByDepartment(departmentId));
		}
	  return "redirect:/total-salary.html"; 
	}
}
