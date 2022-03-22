package com.bs.hrm.service;

import java.time.LocalDate;
import java.util.List;

import com.bs.hrm.entity.Education;

public interface EducationService {
	
	public Education addEducation(Education education);
	
	public Education updateEducation(Education education);
	
	public Education getEducation(Long employeeId, LocalDate completionDate);
	
	public Education getLastEducation(Long employeeId);
	
	public List<Education> getAllEducationByEmployeeId(Long employeeId);

}
