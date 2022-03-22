package com.bs.hrm.entity.ids;

import java.io.Serializable;

public class LeaveId implements Serializable{

	private static final long serialVersionUID = -1455709763533479691L;
	private Long employeeId;
	private Long leaveId;	
	
	public LeaveId() {
	}
	
	public LeaveId(Long employeeId, Long leaveId) {
		super();
		this.employeeId = employeeId;
		this.leaveId = leaveId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((leaveId == null) ? 0 : leaveId.hashCode());
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
		LeaveId other = (LeaveId) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (leaveId == null) {
			if (other.leaveId != null)
				return false;
		} else if (!leaveId.equals(other.leaveId))
			return false;
		return true;
	}

	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(Long leaveId) {
		this.leaveId = leaveId;
	}

}
