package com.bs.hrm.entity.ids;

import java.io.Serializable;
import java.time.LocalDate;

public class ExperienceId implements Serializable{

	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 8983865318386341449L;
	
	private LocalDate       lastActiveDate;
	private Long 			employeeId;
	
	public ExperienceId() {
	}
	
	public ExperienceId(LocalDate lastActiveDate, Long employeeId) {
		super();
		this.lastActiveDate = lastActiveDate;
		this.employeeId = employeeId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((lastActiveDate == null) ? 0 : lastActiveDate.hashCode());
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
		ExperienceId other = (ExperienceId) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (lastActiveDate == null) {
			if (other.lastActiveDate != null)
				return false;
		} else if (!lastActiveDate.equals(other.lastActiveDate))
			return false;
		return true;
	}

	public LocalDate getLastActiveDate() {
		return lastActiveDate;
	}
	public void setLastActiveDate(LocalDate lastActiveDate) {
		this.lastActiveDate = lastActiveDate;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public String toString() {
		return "ExperienceId [lastActiveDate=" + lastActiveDate + ", employeeId=" + employeeId + "]";
	}

	
}
