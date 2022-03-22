package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.BankInfo;
import com.bs.hrm.entity.Deduction;

public interface DeductionService {
	
	public Deduction addDeduction(Deduction deduction);
	
	public Deduction getDeduction(Long employeeId, Long deductionId);
	
	public Deduction updateDeduction(Deduction deduction);
	
	public Deduction getDeduction(Long deductionId);
	
	public List<Deduction> getAllDeduction();
	
	public List<Deduction> getAllDeductionByEmployeeId(Long employeeId);

}
