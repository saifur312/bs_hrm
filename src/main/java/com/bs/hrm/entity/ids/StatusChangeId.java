package com.bs.hrm.entity.ids;

import java.io.Serializable;

public class StatusChangeId implements Serializable{

private static final long serialVersionUID = 1L;
	
	private Long employeeId;
	private Long statusChangeId;
	
	public StatusChangeId() {
		
	}
	
	public StatusChangeId(Long employeeId, Long statusChangeId) {
		super();
		this.employeeId = employeeId;
		this.statusChangeId = statusChangeId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((statusChangeId == null) ? 0 : statusChangeId.hashCode());
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
		StatusChangeId other = (StatusChangeId) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (statusChangeId == null) {
			if (other.statusChangeId != null)
				return false;
		} else if (!statusChangeId.equals(other.statusChangeId))
			return false;
		return true;
	}

	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getStatusChangeId() {
		return statusChangeId;
	}
	public void setStatusChangeId(Long statusChangeId) {
		this.statusChangeId = statusChangeId;
	}
	@Override
	public String toString() {
		return "StatusChangeId [employeeId=" + employeeId + ", statusChangeId=" + statusChangeId + "]";
	}

}