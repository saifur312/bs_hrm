package com.bs.hrm.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.Department;
import com.bs.hrm.repos.DepartmentRepo;
import com.bs.hrm.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired DepartmentRepo departmentRepo; 
	
	@Override
	public Department addDepartment(Department dept) {
		
		// parse date strings into LocalDate object and set to corresponding fields
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		if(!dept.getStartDateStr().isEmpty()) {
			LocalDate startDate = LocalDate.parse(dept.getStartDateStr(), formatter);
			dept.setStartDate(startDate);
		}
		if(!dept.getEndDateStr().isEmpty()) {
			LocalDate endDate = LocalDate.parse(dept.getEndDateStr(), formatter);
			dept.setEndDate(endDate);
		}
		
		// set create date time 
		dept.setCreatedDate(LocalDateTime.now()); 
		Department savedDepartment = departmentRepo.saveAndFlush(dept);
		return savedDepartment;
	}

	@Override
	public Department updateDepartment(Department dept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getDepartment(Integer departmentId) {
		Department department = departmentRepo.findById(departmentId).get();
		if(department != null)
			return department;
		else
			return null;
	}

	@Override
	public List<Department> getAllDepartment() {
		List<Department> allDepartment = departmentRepo.findAll();
		if(!allDepartment.isEmpty()) {
			return allDepartment;
		}else
			return Collections.emptyList();
	}

	
}
