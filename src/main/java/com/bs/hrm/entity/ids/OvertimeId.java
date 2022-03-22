package com.bs.hrm.entity.ids;

import java.io.Serializable;


public class OvertimeId implements Serializable{

private static final long serialVersionUID = 1L;
	
	private Long employeeId;
	private Long overtimeId;
	
	public OvertimeId() {
		
	}

	public OvertimeId(Long employeeId, Long overtimeId) {
		super();
		this.employeeId = employeeId;
		this.overtimeId = overtimeId;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((overtimeId == null) ? 0 : overtimeId.hashCode());
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
		OvertimeId other = (OvertimeId) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (overtimeId == null) {
			if (other.overtimeId != null)
				return false;
		} else if (!overtimeId.equals(other.overtimeId))
			return false;
		return true;
	}
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getOvertimeId() {
		return overtimeId;
	}
	public void setOvertimeId(Long overtimeId) {
		this.overtimeId = overtimeId;
	}

	@Override
	public String toString() {
		return "OvertimeId [employeeId=" + employeeId + ", overtimeId=" + overtimeId + "]";
	}

}
