package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.Loan;

public interface LoanService {

	public Loan addLoan(Loan loan);
	
	public Loan updateLoan(Loan loan);
	
	public Loan getLoan(Long employeeId, Long loanId);
	
	public Loan getLastLoan(Long employeeId);
	
	public List<Loan> getLoansByEmployeeId(Long employeeId);

}
