package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.dto.MonthlySalary;
import com.bs.hrm.dto.TotalSalary;

public interface TotalSalaryService {

	public TotalSalary saveTotalSalary(TotalSalary ts);
	
	public TotalSalary updateTotalSalary(TotalSalary ts);
	
	public TotalSalary getTotalSalary(Integer	year, Integer month, String employeeType);
	
	public List<TotalSalary> getAllTotalSalary();
	
	public List<TotalSalary> getTotalSalaryByYear(Integer	year);
	
	public List<TotalSalary> getTotalSalaryByYearAndMonth(Integer	year, Integer month);
	
	public List<TotalSalary> getTotalSalaryByEmployeeType(String employeeType);
	
	public List<MonthlySalary> getTotalSalaryByDepartment(Integer departmentId);

}
