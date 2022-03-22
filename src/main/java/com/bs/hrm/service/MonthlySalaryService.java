package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.dto.MonthlySalary;

public interface MonthlySalaryService {
	
	public MonthlySalary saveMonthlySalary(MonthlySalary monthlySalary);
	
	public MonthlySalary updateMonthlySalary(MonthlySalary monthlySalary);
	
	public MonthlySalary getMonthlySalary(Long employeeId, Integer	year, Integer month, String employeeType);
	
	public List<MonthlySalary> getAllMonthlySalary();
	
	public List<MonthlySalary> getMonthlySalaryByEmployeeId(Long employeeId);
	
	public List<MonthlySalary> getMonthlySalaryByYear(Integer	year);
	
	public List<MonthlySalary> getMonthlySalaryByYearAndMonth(Integer	year, Integer month);
	
	public List<MonthlySalary> getMonthlySalaryByEmployeeType(String employeeType);
	
	public List<MonthlySalary> getMonthlySalaryByDepartment(Integer departmentId);

}
