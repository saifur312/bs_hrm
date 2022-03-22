package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.Overtime;

public interface OvertimeService {

	public Overtime addOvertime(Overtime overtime);
	
	public Overtime updateOvertime(Overtime overtime);
	
	public Overtime getOvertime(Long employeeId, Long overtimeId);
	
	public Overtime getLastOvertime(Long employeeId);
	
	public List<Overtime> getOvertimesByEmployeeId(Long employeeId);
}
