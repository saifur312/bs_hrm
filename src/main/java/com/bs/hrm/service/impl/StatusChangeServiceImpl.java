package com.bs.hrm.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.StatusChange;
import com.bs.hrm.repos.StatusChangeRepo;
import com.bs.hrm.service.StatusChangeService;
@Service
public class StatusChangeServiceImpl implements StatusChangeService{
	
	@Autowired StatusChangeRepo	statusChangeRepo;
	
	@Override
	public StatusChange addStatusChange(StatusChange statusChange) {
		Long autoIncStatusChangeId = 1L;
		StatusChange lastStatusChange = statusChangeRepo.findTopByEmployeeIdOrderByStatusChangeIdDesc(statusChange.getEmployeeId());
		//increment StatusChangeId manually
		if(lastStatusChange != null)
			autoIncStatusChangeId = lastStatusChange.getStatusChangeId()+ 1L;
		
		//set incremented StatusChange Id into StatusChange entity
		statusChange.setStatusChangeId(autoIncStatusChangeId);
		
		// parse date strings into LocalDate object and set to corresponding fields
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		if(!statusChange.getExecutionDateStr().isEmpty() )
			statusChange.setExecutionDate(LocalDate.parse(statusChange.getExecutionDateStr(), formatter));
		if(!statusChange.getEndDateStr().isEmpty() )
			statusChange.setEndDate(LocalDate.parse(statusChange.getEndDateStr(), formatter));
		
		// set create date time 
		statusChange.setCreatedDate(LocalDateTime.now()); 
		StatusChange savedStatusChange = statusChangeRepo.saveAndFlush(statusChange);
		return savedStatusChange;
	}

	@Override
	public StatusChange updateStatusChange(StatusChange statusChange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusChange getStatusChange(Long employeeId, Long statusChangeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StatusChange getLastStatusChange(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StatusChange> getStatusChangesByEmployeeId(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}



}
