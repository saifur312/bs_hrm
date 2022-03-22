package com.bs.hrm.service.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.Allowance;
import com.bs.hrm.entity.BankInfo;
import com.bs.hrm.entity.Experience;
import com.bs.hrm.entity.ids.AllowanceId;
import com.bs.hrm.entity.ids.ExperienceId;
import com.bs.hrm.repos.AllowanceRepo;
import com.bs.hrm.service.AllowanceService;
@Service
public class AllowanceServiceImpl implements AllowanceService{

	public AllowanceServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired AllowanceRepo allowanceRepo;

	@Override
	public Allowance addAllowance(Allowance allowance) {
		Long autoIncAllowanceId = 1L;
		Allowance lastAllowance = allowanceRepo.findTopByEmployeeIdOrderByAllowanceIdDesc(allowance.getEmployeeId());
		//increment AllowanceId manually
		if(lastAllowance != null)
			autoIncAllowanceId = lastAllowance.getAllowanceId() + 1L;
		//set incremented Allowance Id into Allowance entity
		allowance.setAllowanceId(autoIncAllowanceId);
		
		if(allowance.getBasic() != null)
			allowance.setBasic(new BigDecimal(allowance.getBasic().toString())); 
		else
			allowance.setBasic(new BigDecimal("0.00")); 
		
		if(allowance.getHouseRent() != null)
			allowance.setHouseRent(new BigDecimal(allowance.getHouseRent().toString() )); 
		else
			allowance.setHouseRent(new BigDecimal("0.00")); 
		
		if(allowance.getMedicalAllowance() != null)
			allowance.setMedicalAllowance(new BigDecimal(allowance.getMedicalAllowance().toString() )); 
		else
			allowance.setMedicalAllowance(new BigDecimal("0.00")); 
		
		if(allowance.getClinicalAllowance() != null)
			allowance.setClinicalAllowance(new BigDecimal(allowance.getClinicalAllowance().toString() )); 
		else
			allowance.setClinicalAllowance(new BigDecimal("0.00")); 
		
		if(allowance.getAttendanceAllowance() != null)
			allowance.setAttendanceAllowance(new BigDecimal(allowance.getAttendanceAllowance().toString() )); 
		else
			allowance.setAttendanceAllowance(new BigDecimal("0.00")); 
		
		if(allowance.getDearnessAllowance() != null)
			allowance.setDearnessAllowance(new BigDecimal(allowance.getDearnessAllowance().toString() )); 
		else
			allowance.setDearnessAllowance(new BigDecimal("0.00")); 
		
		if(allowance.getNonPracticeAllowance() != null)
			allowance.setNonPracticeAllowance(new BigDecimal(allowance.getNonPracticeAllowance().toString() )); 
		else
			allowance.setNonPracticeAllowance(new BigDecimal("0.00")); 
		
		if(allowance.getConveyAllowance() != null)
			allowance.setConveyAllowance(new BigDecimal(allowance.getConveyAllowance().toString() )); 
		else
			allowance.setConveyAllowance(new BigDecimal("0.00"));
		
		if(allowance.getTransportAllowance() != null)
			allowance.setTransportAllowance(new BigDecimal(allowance.getTransportAllowance().toString() )); 
		else
			allowance.setTransportAllowance(new BigDecimal("0.00"));
		
		if(allowance.getOtherAllowance() != null)
			allowance.setOtherAllowance(new BigDecimal(allowance.getOtherAllowance().toString() )); 
		else
			allowance.setOtherAllowance(new BigDecimal("0.00")); 
		
		// set create date time 
		allowance.setCreatedDate(LocalDateTime.now()); 
		
		Allowance savedAllowance = allowanceRepo.saveAndFlush(allowance);
		return savedAllowance;
	}

	@Override
	public Allowance getAllowance(Long employeeId, Long allowanceId) {
		Allowance allowance = allowanceRepo.getOne(new AllowanceId(employeeId, allowanceId));
		return allowance;
	}

	@Override
	public Allowance updateAllowance(Allowance allowance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Allowance getAllowance(Long allowanceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Allowance> getAllowance() {
		List<Allowance> allowances = allowanceRepo.findAll();
		if(!allowances.isEmpty()) {
			return allowances;
		}else
			return Collections.emptyList();
	}

	@Override
	public List<Allowance> getAllowanceByEmployeeId(Long employeeId) {
		List<Allowance> allowances = allowanceRepo.findByEmployeeId(employeeId);
		if(!allowances.isEmpty()) {
			return allowances;
		}else
			return Collections.emptyList();
	}

}
