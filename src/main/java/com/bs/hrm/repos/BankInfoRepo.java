package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bs.hrm.entity.BankInfo;
import com.bs.hrm.entity.ids.BankInfoId;

public interface BankInfoRepo extends JpaRepository<BankInfo, BankInfoId>{
	
	public BankInfo	findTopByEmployeeIdOrderByAccountNoDesc(Long employeeId);
	
	public List<BankInfo>	findByEmployeeId(Long employeeId);
	
	public BankInfo	findByAccountNo(String accountNo);

}
