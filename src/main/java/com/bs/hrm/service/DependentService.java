package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.Dependent;

public interface DependentService {
	
	public Dependent addDependent(Dependent dependent);
	
	public Dependent updateDependent(Dependent dependent);
	
	public Dependent getDependent(Long employeeId, Long dependentsId);
	
	public Dependent getLastDependent(Long employeeId);
	
	public List<Dependent> getDependentsByEmployeeId(Long employeeId);

}
