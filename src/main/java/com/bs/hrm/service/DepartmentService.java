package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.Department;

public interface DepartmentService {
	
	public Department			addDepartment(Department dept);
	
	public Department			updateDepartment(Department dept);
	
	public Department			getDepartment(Integer departmentId);
	
	public List<Department>		getAllDepartment();

}
