package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.Category;

public interface CategoryService {
	
	public Category addCategory(Category category);
	
	public Category updateCategory(Category category);
	
	public Category getCategory(Integer categoryId);
	
	public List<Category> getAllCategory();

}
