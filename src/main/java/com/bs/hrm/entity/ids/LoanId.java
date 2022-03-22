package com.bs.hrm.entity.ids;

import java.io.Serializable;

public class LoanId implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long employeeId;
	private Long loanId;
	
	public LoanId() {
		
	}
	public LoanId(Long employeeId, Long loanId) {
		super();
		this.employeeId = employeeId;
		this.loanId = loanId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((loanId == null) ? 0 : loanId.hashCode());
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
		LoanId other = (LoanId) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (loanId == null) {
			if (other.loanId != null)
				return false;
		} else if (!loanId.equals(other.loanId))
			return false;
		return true;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getLoanId() {
		return loanId;
	}
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	@Override
	public String toString() {
		return "LoanId [employeeId=" + employeeId + ", loanId=" + loanId + "]";
	}
	

}
