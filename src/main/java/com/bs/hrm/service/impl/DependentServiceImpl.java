package com.bs.hrm.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.Dependent;
import com.bs.hrm.entity.ids.DependentsIdentity;
import com.bs.hrm.repos.DependentRepo;
import com.bs.hrm.service.DependentService;

@Service
public class DependentServiceImpl implements DependentService{

	@Autowired DependentRepo	dependentRepo;
	
	@Override
	public Dependent addDependent(Dependent dependent) {

		Long autoIncDependentsId = 1L;
		Dependent lastDependent = dependentRepo
										.findTopByEmployeeIdOrderByDependentsIdDesc(dependent.getEmployeeId());
		//increment dependentsId manually
		if(lastDependent != null)
			autoIncDependentsId = lastDependent.getDependentsId()+ 1L;
		
		//set incremented dependents Id into dependents entity
		dependent.setDependentsId(autoIncDependentsId);
		
		// set create date time 
		dependent.setCreatedDate(LocalDateTime.now()); 
		Dependent savedDependent = dependentRepo.saveAndFlush(dependent);
		return savedDependent;
	}

	@Override
	public Dependent updateDependent(Dependent dependent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dependent getDependent(Long employeeId, Long dependentsId) {
		Dependent dependent= dependentRepo.findById(new DependentsIdentity(dependentsId, employeeId)).get();
		return dependent;
	}

	@Override
	public Dependent getLastDependent(Long employeeId) {
		Dependent dependent= dependentRepo.findTopByEmployeeIdOrderByDependentsIdDesc(employeeId);
		return dependent;
	}
	
	@Override
	public List<Dependent> getDependentsByEmployeeId(Long employeeId) {
		List<Dependent> allDependent = dependentRepo.findByEmployeeId(employeeId);
		return allDependent;
	}

}
