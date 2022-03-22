package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bs.hrm.entity.Dependent;
import com.bs.hrm.entity.ids.DependentsIdentity;

public interface DependentRepo extends JpaRepository<Dependent, DependentsIdentity>{
	
	public List<Dependent>	findByEmployeeId(Long 	employeeId);

	public Dependent	findTopByEmployeeIdOrderByDependentsIdDesc(Long employeeId);
	
}
