package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bs.hrm.entity.Education;
import com.bs.hrm.entity.EducationId;

@Repository
public interface EducationRepo extends JpaRepository<Education, EducationId>{
	
	public List<Education>	findByEmployeeId(Long 	employeeId);

	public Education	findTopByEmployeeIdOrderByCompletionDateDesc(Long employeeId);

}
