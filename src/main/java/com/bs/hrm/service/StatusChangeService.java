package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.StatusChange;

public interface StatusChangeService {

	public StatusChange addStatusChange(StatusChange statusChange);
	
	public StatusChange updateStatusChange(StatusChange statusChange);
	
	public StatusChange getStatusChange(Long employeeId, Long statusChangeId);
	
	public StatusChange getLastStatusChange(Long employeeId);
	
	public List<StatusChange> getStatusChangesByEmployeeId(Long employeeId);

}
