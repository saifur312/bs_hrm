package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.Nominee;
import com.bs.hrm.entity.ids.NomineeIdentity;

public interface NomineeService {
	
	public Nominee addNominee(Nominee nominee);
	
	public Nominee getNominee(NomineeIdentity nomineeIdentity);
	
	public Nominee updateNominee(Nominee nominee);
	
	public List<Nominee> getAllNomineeByEmployeeId(Long employeeId);
	
	

}
