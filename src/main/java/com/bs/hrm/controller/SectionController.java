package com.bs.hrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bs.hrm.entity.Section;
import com.bs.hrm.service.DepartmentService;
import com.bs.hrm.service.SectionService;

@Controller
public class SectionController {
	
	@Autowired SectionService sectionService;
	@Autowired DepartmentService departmentService;
	
	@GetMapping("section-add")
	public String showSection(Model model) {
		model.addAttribute("alldepartment", departmentService.getAllDepartment());
		model.addAttribute("section", new Section());
		return "setup/section/section";
		
	}
	
	@PostMapping("section-add-save")
	public String addSection(Model model, Section Section) {
		System.out.println(Section);
		sectionService.addSection(Section);
		return "redirect:/section-add";
		
	}
	
	@GetMapping("section-edit")
	public String showSectionEdit(Model model) {
		return "section";
		
	}
	
	@PostMapping("section-edit-save")
	public String saveSectionEdit(Model model) {
		return "section";
		
	}
	
	@PostMapping("section-delete")
	public String deleteSection(Model model) {
		return "section";
		
	}	
	
	@GetMapping("/section-list.html")
	public String showSectionList(Model model) {
		model.addAttribute("sectionList", sectionService.getAllSection());
		return "setup/section/section-list";
	}


	@GetMapping("section-details") 
	public String showSectionDetails(Model model, @RequestParam Integer sid ) {
	  
		model.addAttribute("section", sectionService.getSection(sid));
		return "setup/section/section";
	}

}
