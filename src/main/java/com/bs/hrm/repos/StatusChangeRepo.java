package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bs.hrm.entity.StatusChange;
import com.bs.hrm.entity.ids.StatusChangeId;

public interface StatusChangeRepo extends JpaRepository<StatusChange, StatusChangeId>{
	
	public List<StatusChange>	findByEmployeeId(Long 	employeeId);

	public StatusChange	findTopByEmployeeIdOrderByStatusChangeIdDesc(Long employeeId);

}
