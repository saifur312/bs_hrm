package com.bs.hrm.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.bs.hrm.entity.Experience;
import com.bs.hrm.entity.Loan;
import com.bs.hrm.entity.ids.ExperienceId;
import com.bs.hrm.entity.ids.LoanId;
import com.bs.hrm.repos.LoanRepo;
import com.bs.hrm.service.LoanService;
@Service
public class LoanServiceImpl implements LoanService{
	
	@Autowired LoanRepo	loanRepo;
	
	@Override
	public Loan addLoan(Loan loan) {
		Long autoIncLoanId = 1L;
		Loan lastLoan = loanRepo.findTopByEmployeeIdOrderByLoanIdDesc(loan.getEmployeeId());
		//increment LoanId manually
		if(lastLoan != null)
			autoIncLoanId = lastLoan.getLoanId()+ 1L;
		
		//set incremented Loan Id into Loan entity
		loan.setLoanId(autoIncLoanId);

		// parse date strings into LocalDate object and set to corresponding fields
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		if(!loan.getTransactionDateStr().isEmpty() )
			loan.setTransactionDate(LocalDate.parse(loan.getTransactionDateStr(), formatter));
		
		// set create date time 
		loan.setCreatedDate(LocalDateTime.now()); 
		Loan savedLoan = loanRepo.saveAndFlush(loan);
		return savedLoan;
	}

	@Override
	public Loan updateLoan(Loan loan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(Long employeeId, Long loanId) {
		Loan savedLoan = loanRepo.getOne(new LoanId(employeeId, loanId));
		return savedLoan;
	}

	@Override
	public Loan getLastLoan(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> getLoansByEmployeeId(Long employeeId) {
		List<Loan> allLoan = loanRepo.findByEmployeeId(employeeId);
		if(!allLoan.isEmpty()) {
			return allLoan;
		}else
			return Collections.emptyList();
	}



}
