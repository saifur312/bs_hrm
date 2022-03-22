package com.bs.hrm.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.Education;
import com.bs.hrm.entity.EducationId;
import com.bs.hrm.repos.EducationRepo;
import com.bs.hrm.service.EducationService;

@Service
public class EducationServiceImpl implements EducationService{

	@Autowired EducationRepo	educationRepo;
	
	@Override
	public Education addEducation(Education education) {

		// parse date strings into LocalDate object and set to corresponding fields
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		if(!education.getCompletionDateStr().isEmpty() )
			education.setCompletionDate(LocalDate.parse(education.getCompletionDateStr(), formatter));
		
		// set create date time 
		education.setCreatedDate(LocalDateTime.now()); 
		Education savedEducation = educationRepo.saveAndFlush(education);
		return savedEducation;
	}

	@Override
	public Education updateEducation(Education education) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Education getEducation(Long employeeId, LocalDate completionDate) {
		Education education = educationRepo.getOne(new EducationId(completionDate, employeeId ));
		return education;
	}

	@Override
	public Education getLastEducation(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Education> getAllEducationByEmployeeId(Long employeeId) {
		List<Education> allEducation = educationRepo.findByEmployeeId(employeeId);
		if(!allEducation.isEmpty()) {
			return allEducation;
		}else
			return Collections.emptyList();
	}
	
}
