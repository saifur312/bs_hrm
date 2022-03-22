package com.bs.hrm.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.hrm.entity.Employee;
import com.bs.hrm.entity.Experience;
import com.bs.hrm.entity.ids.NomineeIdentity;
import com.bs.hrm.service.ExperienceService;
import com.bs.hrm.service.EmployeeService;

@Controller
public class ExperienceController {
	@Autowired ExperienceService 	experienceService;
	@Autowired EmployeeService 		employeeService;
	
	public static final Logger logger = LoggerFactory.getLogger(ExperienceController.class);
	
	@GetMapping("/experience-add")
	public String addExperience(Model model) {
		model.addAttribute("experience", new Experience());
		model.addAttribute("allEmployee", employeeService.getAllEmployee());
		return "employee/experience/experience";
	}
	
	@PostMapping("experience-add-save")
	public String addSaveExperience(Model model, Experience experience) {
		logger.info("Form Data\t"+ experience);
		experienceService.addExperience(experience);
		return "redirect:/experience-add";
		
	}
	
	@GetMapping("experience-list")
	public String showAllNominee(Model model) {
		model.addAttribute("employee", new Employee());
		return "employee/experience/explist";
	}
	
	@PostMapping("/experience-list-find")
	//@ResponseBody
	//public String findExperiences(Employee emp, Model model) {
	public String findExperiences(@RequestBody MultiValueMap<String, String> values, Model model) {
		
		//System.out.println("Values:{}" + values);
		Object findBy		=	values.getFirst("findBy");
        String findByValue	=	values.getFirst("findByValue");
		System.out.println("After extract\t" + findBy + "\t" + findByValue);
		
		if(findBy.equals("EmployeeId")) { 
			model.addAttribute("allExperience", experienceService
					.getAllExperienceByEmployeeId(Long.parseLong(findByValue))); 
		}
		 

		//Long employeeId	=	values.getFirst("employeeId");
		/*
		 * System.out.println("After extract\t" + emp.getEmployeeId() );
		 * 
		 * model.addAttribute("allExperience", experienceService
		 * .getAllExperienceByEmployeeId(emp.getEmployeeId()));
		 */
		model.addAttribute("show", true);
		return "employee/experience/explist";
	}	
	
	/*
	 * @GetMapping("experience-details") public String showExperienceDetails(Model
	 * model, @RequestParam Long eid,
	 * 
	 * @RequestParam("lad") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate lad) {
	 * 
	 * model.addAttribute("experience", experienceService.getExperience(eid, lad));
	 * return "employee/experience/expdet"; }
	 */
	
	
	  @GetMapping("experience-details") 
	  public String showExperienceDetails(Model  model, @RequestParam Long eid, @RequestParam String lad) { 
		  LocalDate lastActDate = LocalDate.parse(lad,
			  DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		  model.addAttribute("experience", experienceService.getExperience(eid, lastActDate)); 
		  return "employee/experience/expdet"; 
	  }
	 

}
