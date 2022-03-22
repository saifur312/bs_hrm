package com.bs.hrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bs.hrm.entity.Code;
import com.bs.hrm.service.CodeService;
import com.bs.hrm.service.DepartmentService;
import com.bs.hrm.service.CodeService;

@Controller
public class CodeController {
	
	@Autowired CodeService codeService;
	@Autowired DepartmentService deptService;
	
	@GetMapping("/code-add")
	public String addCode(Model model) {
		System.out.println("Code size: " + codeService.getAllCode().size());
		model.addAttribute("code", new Code());

	    //model.addAttribute("department", GSON.toJson(list));
		model.addAttribute("department", deptService.getAllDepartment());
		return "setup/code/code";
		
	}
	
	@PostMapping("code-add-save")
	public String saveCode(Model model, Code code) {
		System.out.println(code);
		codeService.addCode(code);
		return "redirect:/code-add";
		
	}
	
	@PostMapping("code-update-save")
	public String updateCode(Model model, Code code) {
		codeService.updateCode(code);
		return "redirect:/code-add";
		
	}
	
	
	@GetMapping("/codelist.html")
	public String showCodeList(Model model) {
		model.addAttribute("codeList", codeService.getAllCode());
		return "setup/code/codelist";
		
	}
}
