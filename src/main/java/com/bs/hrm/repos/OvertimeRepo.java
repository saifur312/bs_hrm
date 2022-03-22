package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bs.hrm.entity.Overtime;
import com.bs.hrm.entity.ids.OvertimeId;

public interface OvertimeRepo extends JpaRepository<Overtime, OvertimeId>{
	
	public List<Overtime>	findByEmployeeId(Long 	employeeId);

	public Overtime	findTopByEmployeeIdOrderByOvertimeIdDesc(Long employeeId);

}
