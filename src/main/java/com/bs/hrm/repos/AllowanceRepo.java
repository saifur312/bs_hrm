package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bs.hrm.entity.Allowance;
import com.bs.hrm.entity.ids.AllowanceId;

public interface AllowanceRepo extends JpaRepository<Allowance, AllowanceId>{
	
	public Allowance	findTopByEmployeeIdOrderByAllowanceIdDesc(Long employeeId);
	
	public Allowance	findByAllowanceId(Long allowanceId);
	
	public List<Allowance>	findByEmployeeId(Long employeeId);

}
