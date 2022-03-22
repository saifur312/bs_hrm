package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bs.hrm.entity.Loan;
import com.bs.hrm.entity.ids.LoanId;

public interface LoanRepo extends JpaRepository<Loan, LoanId>{
	
	public List<Loan>	findByEmployeeId(Long 	employeeId);

	public Loan	findTopByEmployeeIdOrderByLoanIdDesc(Long employeeId);

}
