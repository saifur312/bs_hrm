

package com.bs.hrm.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.DecimalMin;

import com.bs.hrm.entity.ids.AllowanceId;
@Entity
@IdClass(AllowanceId.class)
public class Allowance {
	@Id
	private Long 			employeeId;
	@Id
	private Long 			allowanceId;
	@DecimalMin(value = "0.0")
	private BigDecimal 		basic;
	@DecimalMin(value = "0.0")
	private BigDecimal 		houseRent;
	@DecimalMin(value = "0.0")
	private BigDecimal 		medicalAllowance;
	@DecimalMin(value = "0.0")
	private BigDecimal 		clinicalAllowance;
	@DecimalMin(value = "0.0")
	private BigDecimal 		attendanceAllowance;
	@DecimalMin(value = "0.0")
	private BigDecimal 		dearnessAllowance;
	@DecimalMin(value = "0.0")
	private BigDecimal 		nonPracticeAllowance;
	@DecimalMin(value = "0.0")
	private BigDecimal 		conveyAllowance;
	@DecimalMin(value = "0.0")
	private BigDecimal 		transportAllowance;
	@DecimalMin(value = "0.0")
	private BigDecimal 		otherAllowance;
	@Column(length=80)
 	private String	    	filler1;
	@Column(length=80)
 	private String	    	filler2;
	@Column(length=80)
 	private String	    	filler3;
	@Column(length=80)
 	private String	    	filler4;
	@Column(length=80)
 	private String	    	filler5;
 	private LocalDateTime   createdDate;
	@Column(length=30)
 	private String	    	createdBy;
	@Column(length=50)
 	private String	    	createdIp;
 	private LocalDateTime 	updatedDate;
	@Column(length=30)
 	private String	    	updatedBy;
	@Column(length=40)
 	private String	    	updatedIp;	
	
	public Allowance() {
		
	}
	
	public Allowance(Long employeeId, Long allowanceId, @DecimalMin("0.0") BigDecimal basic,
			@DecimalMin("0.0") BigDecimal houseRent, @DecimalMin("0.0") BigDecimal medicalAllowance,
			@DecimalMin("0.0") BigDecimal clinicalAllowance, @DecimalMin("0.0") BigDecimal attendanceAllowance,
			@DecimalMin("0.0") BigDecimal dearnessAllowance, @DecimalMin("0.0") BigDecimal nonPracticeAllowance,
			@DecimalMin("0.0") BigDecimal conveyAllowance, @DecimalMin("0.0") BigDecimal transportAllowance,
			@DecimalMin("0.0") BigDecimal otherAllowance, String filler1, String filler2, String filler3,
			String filler4, String filler5, LocalDateTime createdDate, String createdBy, String createdIp,
			LocalDateTime updatedDate, String updatedBy, String updatedIp) {
		super();
		this.employeeId = employeeId;
		this.allowanceId = allowanceId;
		this.basic = basic;
		this.houseRent = houseRent;
		this.medicalAllowance = medicalAllowance;
		this.clinicalAllowance = clinicalAllowance;
		this.attendanceAllowance = attendanceAllowance;
		this.dearnessAllowance = dearnessAllowance;
		this.nonPracticeAllowance = nonPracticeAllowance;
		this.conveyAllowance = conveyAllowance;
		this.transportAllowance = transportAllowance;
		this.otherAllowance = otherAllowance;
		this.filler1 = filler1;
		this.filler2 = filler2;
		this.filler3 = filler3;
		this.filler4 = filler4;
		this.filler5 = filler5;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.createdIp = createdIp;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		this.updatedIp = updatedIp;
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
	public BigDecimal getBasic() {
		return basic;
	}
	public void setBasic(BigDecimal basic) {
		this.basic = basic;
	}
	public BigDecimal getHouseRent() {
		return houseRent;
	}
	public void setHouseRent(BigDecimal houseRent) {
		this.houseRent = houseRent;
	}
	public BigDecimal getMedicalAllowance() {
		return medicalAllowance;
	}
	public void setMedicalAllowance(BigDecimal medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}
	public BigDecimal getClinicalAllowance() {
		return clinicalAllowance;
	}
	public void setClinicalAllowance(BigDecimal clinicalAllowance) {
		this.clinicalAllowance = clinicalAllowance;
	}
	public BigDecimal getAttendanceAllowance() {
		return attendanceAllowance;
	}
	public void setAttendanceAllowance(BigDecimal attendanceAllowance) {
		this.attendanceAllowance = attendanceAllowance;
	}
	public BigDecimal getDearnessAllowance() {
		return dearnessAllowance;
	}
	public void setDearnessAllowance(BigDecimal dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}
	public BigDecimal getNonPracticeAllowance() {
		return nonPracticeAllowance;
	}
	public void setNonPracticeAllowance(BigDecimal nonPracticeAllowance) {
		this.nonPracticeAllowance = nonPracticeAllowance;
	}
	public BigDecimal getConveyAllowance() {
		return conveyAllowance;
	}
	public void setConveyAllowance(BigDecimal conveyAllowance) {
		this.conveyAllowance = conveyAllowance;
	}
	public BigDecimal getTransportAllowance() {
		return transportAllowance;
	}
	public void setTransportAllowance(BigDecimal transportAllowance) {
		this.transportAllowance = transportAllowance;
	}
	public BigDecimal getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(BigDecimal otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public String getFiller1() {
		return filler1;
	}
	public void setFiller1(String filler1) {
		this.filler1 = filler1;
	}
	public String getFiller2() {
		return filler2;
	}
	public void setFiller2(String filler2) {
		this.filler2 = filler2;
	}
	public String getFiller3() {
		return filler3;
	}
	public void setFiller3(String filler3) {
		this.filler3 = filler3;
	}
	public String getFiller4() {
		return filler4;
	}
	public void setFiller4(String filler4) {
		this.filler4 = filler4;
	}
	public String getFiller5() {
		return filler5;
	}
	public void setFiller5(String filler5) {
		this.filler5 = filler5;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedIp() {
		return createdIp;
	}
	public void setCreatedIp(String createdIp) {
		this.createdIp = createdIp;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedIp() {
		return updatedIp;
	}
	public void setUpdatedIp(String updatedIp) {
		this.updatedIp = updatedIp;
	}

	@Override
	public String toString() {
		return "Allowance [employeeId=" + employeeId + ", allowanceId=" + allowanceId + ", basic=" + basic
				+ ", houseRent=" + houseRent + ", medicalAllowance=" + medicalAllowance + ", clinicalAllowance="
				+ clinicalAllowance + ", attendanceAllowance=" + attendanceAllowance + ", dearnessAllowance="
				+ dearnessAllowance + ", nonPracticeAllowance=" + nonPracticeAllowance + ", conveyAllowance="
				+ conveyAllowance + ", transportAllowance=" + transportAllowance + ", otherAllowance=" + otherAllowance
				+ ", filler1=" + filler1 + ", filler2=" + filler2 + ", filler3=" + filler3 + ", filler4=" + filler4
				+ ", filler5=" + filler5 + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", createdIp="
				+ createdIp + ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp
				+ "]";
	}
	
	
	

}
