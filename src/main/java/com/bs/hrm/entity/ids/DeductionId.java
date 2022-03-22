package com.bs.hrm.entity.ids;

import java.io.Serializable;

public class DeductionId implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long 			employeeId;
	private Long 			deductionId;
	
	public DeductionId() {

	}
	
	public DeductionId(Long employeeId, Long deductionId) {
		super();
		this.employeeId = employeeId;
		this.deductionId = deductionId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deductionId == null) ? 0 : deductionId.hashCode());
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
		DeductionId other = (DeductionId) obj;
		if (deductionId == null) {
			if (other.deductionId != null)
				return false;
		} else if (!deductionId.equals(other.deductionId))
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
	public Long getDeductionId() {
		return deductionId;
	}
	public void setDeductionId(Long deductionId) {
		this.deductionId = deductionId;
	}
	
	@Override
	public String toString() {
		return "DeductionId [employeeId=" + employeeId + ", deductionId=" + deductionId + "]";
	}

}
