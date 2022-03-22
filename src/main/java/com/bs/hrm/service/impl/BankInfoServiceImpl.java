package com.bs.hrm.service.impl;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.Allowance;
import com.bs.hrm.entity.BankInfo;
import com.bs.hrm.entity.ids.AllowanceId;
import com.bs.hrm.entity.ids.BankInfoId;
import com.bs.hrm.repos.BankInfoRepo;
import com.bs.hrm.service.BankInfoService;
@Service
public class BankInfoServiceImpl implements BankInfoService{

	@Autowired BankInfoRepo bankInfoRepo;
	
	@Override
	public BankInfo addBankInfo(BankInfo bankInfo) {		
		// set create date time 
		bankInfo.setCreatedDate(LocalDateTime.now()); 
		if( !bankInfo.getAccountNo().isEmpty()) {
			bankInfoRepo.save(bankInfo);
			bankInfoRepo.flush();
		}
		return null;
	}

	@Override
	public BankInfo getBankInfo(Long employeeId, String accountNo) {
		BankInfo bankInfo = bankInfoRepo.findById(new BankInfoId(employeeId, accountNo)).get();
		return bankInfo;
	}

	@Override
	public BankInfo updateBankInfo(BankInfo bankInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankInfo getBankInfo(String accountNo) {
		BankInfo bankInfo = bankInfoRepo.findByAccountNo(accountNo);
		return bankInfo;
	}

	@Override
	public List<BankInfo> getAllBankInfo() {
		List<BankInfo> bankInfoList = bankInfoRepo.findAll();
		if(!bankInfoList.isEmpty()) {
			return bankInfoList;
		}else
			return Collections.emptyList();
	}

	@Override
	public List<BankInfo> getAllBankInfoByEmployeeId(Long employeeId) {
		List<BankInfo> bankInfoList = bankInfoRepo.findByEmployeeId(employeeId);
		if(!bankInfoList.isEmpty()) {
			return bankInfoList;
		}else
			return Collections.emptyList();
	}

}
