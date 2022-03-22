package com.bs.hrm.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.Category;
import com.bs.hrm.entity.JobTitle;
import com.bs.hrm.repos.CategoryRepo;
import com.bs.hrm.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired CategoryRepo categoryRepo;
	
	@Override
	public Category addCategory(Category category) {
		// set create date time 
		category.setCreatedDate(LocalDateTime.now()); 
		categoryRepo.saveAndFlush(category);
		return null;
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getCategory(Integer categoryId) {
		Category category = categoryRepo.findById(categoryId).get();
		return category;
	}

	@Override
	public List<Category> getAllCategory() {
		List<Category> allCategory = categoryRepo.findAll();
		if(allCategory.isEmpty())
			return null;
		else
			return allCategory;
	}

}
