package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bs.hrm.entity.Deduction;
import com.bs.hrm.entity.ids.DeductionId;

public interface DeductionRepo extends JpaRepository<Deduction, DeductionId>{
	
	public Deduction findTopByEmployeeIdOrderByDeductionIdDesc(Long employeeId);
	
	public List<Deduction>	findByEmployeeId(Long employeeId);

}
