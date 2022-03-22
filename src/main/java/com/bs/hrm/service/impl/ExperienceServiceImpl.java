package com.bs.hrm.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.Experience;
import com.bs.hrm.entity.ids.ExperienceId;
import com.bs.hrm.repos.ExperienceRepo;
import com.bs.hrm.service.ExperienceService;

@Service
public class ExperienceServiceImpl implements ExperienceService{

	@Autowired ExperienceRepo	experienceRepo;
	
	@Override
	public Experience addExperience(Experience experience) {
		// parse date strings into LocalDate object and set to corresponding fields
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		if(!experience.getLastActiveDateStr().isEmpty() )
			experience.setLastActiveDate(LocalDate.parse(experience.getLastActiveDateStr(), formatter));
		
		 if(!experience.getStartDateStr().isEmpty() )
		  experience.setStartDate(LocalDate.parse(experience.getStartDateStr(), formatter));
		  if(!experience.getEndDateStr().isEmpty() )
		  experience.setEndDate(LocalDate.parse(experience.getEndDateStr(), formatter));
		 
		
		// set create date time 
		experience.setCreatedDate(LocalDateTime.now()); 
		Experience savedExperience = experienceRepo.saveAndFlush(experience);
		return savedExperience;
	}

	@Override
	public Experience updateExperience(Experience experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Experience getExperience(Long employeeId, LocalDate lastActiveDate) {
		Experience experience = experienceRepo.getOne(new ExperienceId(lastActiveDate, employeeId));
		return experience;
	}

	@Override
	public Experience getLastExperience(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Experience> getAllExperienceByEmployeeId(Long employeeId) {
		List<Experience> allExperience = experienceRepo.findByEmployeeId(employeeId);
		if(!allExperience.isEmpty()) {
			return allExperience;
		}else
			return Collections.emptyList();
	}

}
