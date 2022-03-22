package com.bs.hrm.entity.ids;

import java.io.Serializable;

public class BankInfoId implements Serializable{

	private static final long serialVersionUID = 8381008268985318613L;
	
	private Long 			employeeId;
	private String 			accountNo;
	
	public BankInfoId() {
		
	}
	
	public BankInfoId(Long employeeId, String accountNo) {
		super();
		this.employeeId = employeeId;
		this.accountNo = accountNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNo == null) ? 0 : accountNo.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankInfoId other = (BankInfoId) obj;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}

	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public String toString() {
		return "BankInfoId [employeeId=" + employeeId + ", accountNo=" + accountNo + "]";
	}

}
