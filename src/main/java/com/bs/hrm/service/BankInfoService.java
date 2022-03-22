package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.BankInfo;

public interface BankInfoService {
	
	public BankInfo addBankInfo(BankInfo bankInfo);
	
	public BankInfo getBankInfo(Long employeeId, String accountNo);
	
	public BankInfo updateBankInfo(BankInfo bankInfo);
	
	public BankInfo getBankInfo(String 	accountNo);
	
	public List<BankInfo> getAllBankInfo();
	
	public List<BankInfo> getAllBankInfoByEmployeeId(Long employeeId);

}
