package com.bs.hrm.service.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.BankInfo;
import com.bs.hrm.entity.Deduction;
import com.bs.hrm.entity.ids.BankInfoId;
import com.bs.hrm.entity.ids.DeductionId;
import com.bs.hrm.repos.DeductionRepo;
import com.bs.hrm.service.DeductionService;
@Service
public class DeductionServiceImpl implements DeductionService{

	@Autowired DeductionRepo deductionRepo;

	@Override
	public Deduction addDeduction(Deduction deduction) {
		Long autoIncDeductionId = 1L;
		Deduction lastDeduction = deductionRepo.findTopByEmployeeIdOrderByDeductionIdDesc(deduction.getEmployeeId());
		//increment DeductionId manually
		if(lastDeduction != null)
			autoIncDeductionId = lastDeduction.getDeductionId() + 1L;
		//set incremented Deduction Id into Deduction entity
		deduction.setDeductionId(autoIncDeductionId);
		
		if(deduction.getRoomCharge() != null)
			deduction.setRoomCharge(new BigDecimal(deduction.getRoomCharge().toString())); 
		else
			deduction.setRoomCharge(new BigDecimal("0.00")); 
		
		if(deduction.getIncomeTax() != null)
			deduction.setIncomeTax(new BigDecimal(deduction.getIncomeTax().toString())); 
		else
			deduction.setIncomeTax(new BigDecimal("0.00")); 
		
		if(deduction.getProvidentFund() != null)
			deduction.setProvidentFund(new BigDecimal(deduction.getProvidentFund().toString())); 
		else
			deduction.setProvidentFund(new BigDecimal("0.00")); 
		
		if(deduction.getWalefareFund() != null)
			deduction.setWalefareFund(new BigDecimal(deduction.getWalefareFund().toString())); 
		else
			deduction.setWalefareFund(new BigDecimal("0.00")); 
		
		if(deduction.getMeal() != null)
			deduction.setMeal(new BigDecimal(deduction.getMeal().toString())); 
		else
			deduction.setMeal(new BigDecimal("0.00")); 
		
		if(deduction.getOtherDeductions() != null)
			deduction.setOtherDeductions(new BigDecimal(deduction.getOtherDeductions().toString())); 
		else
			deduction.setOtherDeductions(new BigDecimal("0.00")); 
		// set create date time 
		deduction.setCreatedDate(LocalDateTime.now()); 
		
		Deduction savedDeduction = deductionRepo.saveAndFlush(deduction);
		return savedDeduction;
	}

	@Override
	public Deduction getDeduction(Long employeeId, Long deductionId) {
		Deduction deduction = deductionRepo.findById(new DeductionId(employeeId, deductionId)).get();
		return deduction;
	}

	@Override
	public Deduction updateDeduction(Deduction deduction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Deduction getDeduction(Long deductionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Deduction> getAllDeduction() {
		List<Deduction> deductionList = deductionRepo.findAll();
		if(!deductionList.isEmpty()) {
			return deductionList;
		}else
			return Collections.emptyList();
	}

	@Override
	public List<Deduction> getAllDeductionByEmployeeId(Long employeeId) {
		List<Deduction> deductionList = deductionRepo.findByEmployeeId(employeeId);
		if(!deductionList.isEmpty()) {
			return deductionList;
		}else
			return Collections.emptyList();
	}

}
