package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.Leave;

public interface LeaveService {

	public Leave addLeave(Leave leave);
	
	public Leave updateLeave(Leave leave);
	
	public Leave getLeave(Long employeeId, Long leaveId);
	
	public Leave getLastLeave(Long employeeId);
	
	public List<Leave> getLeavesByEmployeeId(Long employeeId);

}
