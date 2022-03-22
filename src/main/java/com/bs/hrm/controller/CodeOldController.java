package com.bs.hrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bs.hrm.entity.CodeOld;
import com.bs.hrm.service.CodeOldService;

@Controller
public class CodeOldController {
	
	/*
	 * @Autowired CodeOldService codeOldService;
	 * 
	 * @GetMapping("/code-add") public String addCode(Model model) {
	 * System.out.println("Code size: " + codeOldService.getAllCode().size());
	 * model.addAttribute("code", new CodeOld()); return "setup/code";
	 * 
	 * }
	 * 
	 * @PostMapping("code-add-save") public String saveCode(Model model, CodeOld
	 * codeOld) { System.out.println(codeOld); codeOldService.addCode(codeOld); return
	 * "redirect:/code-add";
	 * 
	 * }
	 * 
	 * @PostMapping("code-update-save") public String updateCode(Model model,
	 * CodeOld codeOld) { codeOldService.updateCode(codeOld); return
	 * "redirect:/code-add";
	 * 
	 * }
	 */
}
