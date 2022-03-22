package com.bs.hrm.entity.ids;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class NomineeIdentity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long 		nomineeId;
	private Long 		employeeId;
	
	public NomineeIdentity() {
		
	}

	public NomineeIdentity(Long nomineeId, Long employeeId) {
		super();
		this.nomineeId = nomineeId;
		this.employeeId = employeeId;
	}

	/*
	 * public NomineeIdentity(Long employeeId) { super(); nomineeRepo.
	 * findTopByNomineeIdentityEmployeeIdOrderByNomineeIdentityNomineeIdDesc(
	 * employeeId); this.nomineeId = nomineeId; }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((nomineeId == null) ? 0 : nomineeId.hashCode());
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
		NomineeIdentity other = (NomineeIdentity) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (nomineeId == null) {
			if (other.nomineeId != null)
				return false;
		} else if (!nomineeId.equals(other.nomineeId))
			return false;
		return true;
	}

	public Long getNomineeId() {
		return nomineeId;
	}
	public void setNomineeId(Long nomineeId) {
		this.nomineeId = nomineeId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "NomineeIdentity [nomineeId=" + nomineeId + ", employeeId=" + employeeId + "]";
	}

}
