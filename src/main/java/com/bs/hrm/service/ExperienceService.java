package com.bs.hrm.service;

import java.time.LocalDate;
import java.util.List;

import com.bs.hrm.entity.Experience;

public interface ExperienceService {
	
	public Experience addExperience(Experience experience);
	
	public Experience updateExperience(Experience experience);
	
	public Experience getExperience(Long employeeId, LocalDate lastActiveDate);
	
	public Experience getLastExperience(Long employeeId);
	
	public List<Experience> getAllExperienceByEmployeeId(Long employeeId);

}
