package com.bs.hrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bs.hrm.entity.Category;
import com.bs.hrm.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired CategoryService	categoryService;
	

	@GetMapping("category-add")
	public String addCategory(Model model) {
		model.addAttribute("category", new Category());
		return "setup/category/category";
		
	}
	
	@PostMapping("category-add-save")
	public String saveCategory(Model model, Category category) {
		System.out.println(category);
		categoryService.addCategory(category);
		return "redirect:/category-add";
		
	}
	
	@PostMapping("category-update-save")
	public String updateCategory(Model model, Category category) {
		categoryService.updateCategory(category);
		return "redirect:/category-add";
		
	}
	
	
	/*
	 * @GetMapping("add-category") public void saveCategory(Category category) {
	 * 
	 * 
	 * Category cat1 = new Category(1, "Category1", "Demo Category-1", true, null,
	 * null, null, null, null, null, null, null, null, null, null);
	 * 
	 * Category cat2 = new Category(2, "Category2", "Demo Category-2", true, null,
	 * null, null, null, null, null, null, null, null, null, null); Category cat3 =
	 * new Category(3, "Category3", "Demo Category-3", true, null, null, null, null,
	 * null, null, null, null, null, null, null); categoryService.addCategory(cat1);
	 * categoryService.addCategory(cat2); categoryService.addCategory(cat3);
	 * 
	 * }
	 */

	
	@GetMapping("/category-list.html")
	public String showCategoryList(Model model) {
		model.addAttribute("categoryList", categoryService.getAllCategory());
		return "setup/category/category-list";
	}


	@GetMapping("category-details") 
	public String showCategoryDetails(Model model, @RequestParam Integer cid ) {
	  
		model.addAttribute("category", categoryService.getCategory(cid)); 

		return "setup/category/category";
	}
}
