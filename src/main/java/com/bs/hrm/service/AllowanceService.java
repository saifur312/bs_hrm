package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.Allowance;
import com.bs.hrm.entity.BankInfo;

public interface AllowanceService {
	
	public Allowance addAllowance(Allowance allowance);
	
	public Allowance getAllowance(Long employeeId, Long allowanceId);
	
	public Allowance updateAllowance(Allowance allowance);
	
	public Allowance getAllowance(Long allowanceId);
	
	public List<Allowance> getAllowance();
	
	public List<Allowance> getAllowanceByEmployeeId(Long employeeId);

}
