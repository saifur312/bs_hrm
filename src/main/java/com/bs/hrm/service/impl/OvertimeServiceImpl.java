package com.bs.hrm.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.JobTitle;
import com.bs.hrm.entity.Loan;
import com.bs.hrm.entity.Overtime;
import com.bs.hrm.entity.ids.LoanId;
import com.bs.hrm.entity.ids.OvertimeId;
import com.bs.hrm.repos.OvertimeRepo;
import com.bs.hrm.service.OvertimeService;
@Service
public class OvertimeServiceImpl implements OvertimeService{
	
	@Autowired OvertimeRepo	overtimeRepo;
	
	@Override
	public Overtime addOvertime(Overtime overtime) {
		Long autoIncOvertimeId = 1L;
		Overtime lastOvertime = overtimeRepo.findTopByEmployeeIdOrderByOvertimeIdDesc(overtime.getEmployeeId());
		//increment OvertimeId manually
		if(lastOvertime != null)
			autoIncOvertimeId = lastOvertime.getOvertimeId()+ 1L;
		
		//set incremented Overtime Id into Overtime entity
		overtime.setOvertimeId(autoIncOvertimeId);
		

		// parse date strings into LocalDate object and set to corresponding fields
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		if(!overtime.getOvertimeDateStr().isEmpty() )
			overtime.setOvertimeDate(LocalDate.parse(overtime.getOvertimeDateStr(), formatter));
		
		// set create date time 
		overtime.setCreatedDate(LocalDateTime.now()); 
		Overtime savedOvertime = overtimeRepo.saveAndFlush(overtime);
		return savedOvertime;
	}

	@Override
	public Overtime updateOvertime(Overtime overtime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Overtime getOvertime(Long employeeId, Long overtimeId) {
		Overtime savedOvertime = overtimeRepo.getOne(new OvertimeId(employeeId, overtimeId));
		return savedOvertime;
	}

	@Override
	public Overtime getLastOvertime(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Overtime> getOvertimesByEmployeeId(Long employeeId) {
		List<Overtime> allOvertime = overtimeRepo.findByEmployeeId(employeeId);
		if(allOvertime.isEmpty())
			return null;
		else
			return allOvertime;
	}


}
