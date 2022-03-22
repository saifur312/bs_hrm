package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bs.hrm.entity.Experience;
import com.bs.hrm.entity.ids.ExperienceId;

@Repository
public interface ExperienceRepo extends JpaRepository<Experience, ExperienceId>{

	  public List<Experience> findByEmployeeId(Long employeeId);
	  
	  public Experience findTopByEmployeeIdOrderByLastActiveDateDesc(Long employeeId);
	 

}
