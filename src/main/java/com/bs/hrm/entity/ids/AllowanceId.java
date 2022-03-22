package com.bs.hrm.entity.ids;

import java.io.Serializable;

public class AllowanceId implements Serializable{

	private static final long serialVersionUID = 8364707685109622509L;
	//private static final long serialVersionUID = 1L;
	
	private Long 		employeeId;
	private Long 		allowanceId;
	
	public AllowanceId() {
		
	}

	public AllowanceId(Long employeeId, Long allowanceId) {
		super();
		this.employeeId = employeeId;
		this.allowanceId = allowanceId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allowanceId == null) ? 0 : allowanceId.hashCode());
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
		AllowanceId other = (AllowanceId) obj;
		if (allowanceId == null) {
			if (other.allowanceId != null)
				return false;
		} else if (!allowanceId.equals(other.allowanceId))
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
	public Long getAllowanceId() {
		return allowanceId;
	}
	public void setAllowanceId(Long allowanceId) {
		this.allowanceId = allowanceId;
	}

	@Override
	public String toString() {
		return "AllowanceId [employeeId=" + employeeId + ", allowanceId=" + allowanceId + "]";
	}

}
