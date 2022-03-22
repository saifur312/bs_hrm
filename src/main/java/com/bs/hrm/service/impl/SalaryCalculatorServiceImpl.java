package com.bs.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.dto.EmployeeDto;
import com.bs.hrm.dto.MonthlySalary;
import com.bs.hrm.dto.TotalSalary;
import com.bs.hrm.entity.Employee;
import com.bs.hrm.entity.JobTitle;
import com.bs.hrm.service.AllowanceService;
import com.bs.hrm.service.EmployeeService;
import com.bs.hrm.service.JobTitleService;
import com.bs.hrm.service.LoanService;
import com.bs.hrm.service.OvertimeService;
import com.bs.hrm.service.SalaryCalculatorService;

@Service
public class SalaryCalculatorServiceImpl implements SalaryCalculatorService{

	@Autowired EmployeeService employeeService;
	@Autowired OvertimeService OvertimeService;
	@Autowired AllowanceService allowanceService;
	@Autowired LoanService loanService;
	@Autowired JobTitleService jobTitleService;
	
	@Override
	public MonthlySalary calculateMonthlySalary(Integer month) {
		List<EmployeeDto> employeeList = employeeService.getAllEmployee();
		List<JobTitle> jobTitleList = jobTitleService.getAllJobTitle();
		
		for(EmployeeDto employee : employeeList) {
			
		}
		
		return null;
	}

	@Override
	public TotalSalary calculateTotalSalary() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
