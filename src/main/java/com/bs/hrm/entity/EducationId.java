package com.bs.hrm.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class EducationId implements Serializable{

	private static final long serialVersionUID = 1L;

	private LocalDate       completionDate;
	private Long 			employeeId;
	
	public EducationId() {
		
	}
	
	public EducationId(LocalDate completionDate, Long employeeId) {
		super();
		this.completionDate = completionDate;
		this.employeeId = employeeId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((completionDate == null) ? 0 : completionDate.hashCode());
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
		EducationId other = (EducationId) obj;
		if (completionDate == null) {
			if (other.completionDate != null)
				return false;
		} else if (!completionDate.equals(other.completionDate))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}

	public LocalDate getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(LocalDate completionDate) {
		this.completionDate = completionDate;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "EducationId [completionDate=" + completionDate + ", employeeId=" + employeeId + "]";
	}

}
