package com.bs.hrm.entity.ids;

import java.io.Serializable;
//Composite key class
public class DependentsIdentity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long 			dependentsId;
	private Long 			employeeId;
	
	public DependentsIdentity() {
	}
	
	public DependentsIdentity(Long dependentsId, Long employeeId) {
		super();
		this.dependentsId = dependentsId;
		this.employeeId = employeeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dependentsId == null) ? 0 : dependentsId.hashCode());
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
		DependentsIdentity other = (DependentsIdentity) obj;
		if (dependentsId == null) {
			if (other.dependentsId != null)
				return false;
		} else if (!dependentsId.equals(other.dependentsId))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}

	public Long getDependentsId() {
		return dependentsId;
	}
	public void setDependentsId(Long dependentsId) {
		this.dependentsId = dependentsId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public String toString() {
		return "DependentsIdentity [dependentsId=" + dependentsId + ", employeeId=" + employeeId + "]";
	}
	

}
