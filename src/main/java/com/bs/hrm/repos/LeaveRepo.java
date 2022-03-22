package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bs.hrm.entity.Leave;
import com.bs.hrm.entity.ids.LeaveId;

public interface LeaveRepo extends JpaRepository<Leave, LeaveId>{
	
	public List<Leave>	findByEmployeeId(Long 	employeeId);

	public Leave	findTopByEmployeeIdOrderByLeaveIdDesc(Long employeeId);

}
