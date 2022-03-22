package com.bs.hrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bs.hrm.entity.JobTitle;
import com.bs.hrm.service.JobTitleService;

@Controller
public class JobTitleController {
	
	@Autowired JobTitleService jobTitleService;
	
	@GetMapping("jobtitle-add")
	public String addJobTitle(Model model) {
		model.addAttribute("jobtitle", new JobTitle());
		return "setup/jobtitle/jobtitle";
		
	}
	
	@PostMapping("jobtitle-add-save")
	public String saveJobTitle(Model model, JobTitle jobTitle) {
		System.out.println(jobTitle);
		jobTitleService.addJobTitle(jobTitle);
		return "redirect:/jobtitle-add";
		
	}
	
	@PostMapping("jobtitle-update-save")
	public String updateJobTitle(Model model, JobTitle jobTitle) {
		jobTitleService.updateJobTitle(jobTitle);
		return "redirect:/jobtitle-add";
		
	}
	
	/*
	 * @GetMapping("add-job") public void saveJobTitle(JobTitle job) {
	 * 
	 * JobTitle job1 = new JobTitle(1, "Manager", null, null, null, null, null,
	 * null, null, null, null, null, null, null, null, null); JobTitle job2 = new
	 * JobTitle(2, "Programmer", null, null, null, null, null, null, null, null,
	 * null, null, null, null, null, null); JobTitle job3 = new JobTitle(3,
	 * "Executive Officer", null, null, null, null, null, null, null, null, null,
	 * null, null, null, null, null); jobTitleService.addJobTitle(job1);
	 * jobTitleService.addJobTitle(job2); jobTitleService.addJobTitle(job3); }
	 */
	

	
	
	@GetMapping("/jobtitle-list.html")
	public String showJobTitleList(Model model) {
		model.addAttribute("jobtitleList", jobTitleService.getAllJobTitle());
		return "setup/jobtitle/jobtitle-list";
	}


	@GetMapping("jobtitle-details") 
	public String showJobTitleDetails(Model model, @RequestParam Integer jid ) {
	  
		model.addAttribute("jobtitle", jobTitleService.getJobTitle(jid));
		return "setup/jobtitle/jobtitle"; 
	}

}
