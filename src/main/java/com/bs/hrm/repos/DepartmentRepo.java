package com.bs.hrm.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bs.hrm.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer>{
	
	Department findByDepartmentId(Integer departmentId);
	
	Department findByDepartmentName(String departmentName);
	
	Department findByManagerName(String managerName);

}
