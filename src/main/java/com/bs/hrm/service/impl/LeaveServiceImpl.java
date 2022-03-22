package com.bs.hrm.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.Leave;
import com.bs.hrm.entity.Leave;
import com.bs.hrm.entity.ids.LeaveId;
import com.bs.hrm.entity.Leave;
import com.bs.hrm.repos.LeaveRepo;
import com.bs.hrm.service.LeaveService;

@Service
public class LeaveServiceImpl implements LeaveService{

	@Autowired LeaveRepo	leaveRepo;
	
	@Override
	public Leave addLeave(Leave leave) {
		Long autoIncLeaveId = 1L;
		Leave lastLeave = leaveRepo.findTopByEmployeeIdOrderByLeaveIdDesc(leave.getEmployeeId());
		//increment LeaveId manually
		if(lastLeave != null)
			autoIncLeaveId = lastLeave.getLeaveId()+ 1L;
		
		//set incremented Leave Id into Leave entity
		leave.setLeaveId(autoIncLeaveId);

		// parse date strings into LocalDate object and set to corresponding fields
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		if(!leave.getStartDateStr().isEmpty() )
			leave.setStartDate(LocalDate.parse(leave.getStartDateStr(), formatter));
		if(!leave.getEndDateStr().isEmpty() )
			leave.setEndDate(LocalDate.parse(leave.getEndDateStr(), formatter));
		
		// set create date time 
		leave.setCreatedDate(LocalDateTime.now()); 
		Leave savedLeave = leaveRepo.saveAndFlush(leave);
		return savedLeave;
	}

	@Override
	public Leave updateLeave(Leave leave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Leave getLeave(Long employeeId, Long leaveId) {
		Leave savedLeave = leaveRepo.getOne(new LeaveId(employeeId, leaveId));
		return savedLeave;
	}

	@Override
	public Leave getLastLeave(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Leave> getLeavesByEmployeeId(Long employeeId) {
		List<Leave> allLeave = leaveRepo.findByEmployeeId(employeeId);
		if(!allLeave.isEmpty()) {
			return allLeave;
		}else
			return Collections.emptyList();
	}



}
