

package com.bs.hrm.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.DecimalMin;

import com.bs.hrm.entity.ids.DeductionId;
@Entity
@IdClass(DeductionId.class)
public class Deduction {

	@Id
	private Long 			employeeId;
	@Id
	private Long 			deductionId;
	@DecimalMin(value = "0.0")
	private BigDecimal 		roomCharge;
	@DecimalMin(value = "0.0")
	private BigDecimal 		incomeTax;
	@DecimalMin(value = "0.0")
	private BigDecimal 		providentFund;
	@DecimalMin(value = "0.0")
	private BigDecimal 		walefareFund;
	@DecimalMin(value = "0.0")
	private BigDecimal 		meal;
	@DecimalMin(value = "0.0")
	private BigDecimal 		otherDeductions;
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
	
	public Deduction(){
		
	}
	public Deduction(Long employeeId, Long deductionId, @DecimalMin("0.0") BigDecimal roomCharge,
			@DecimalMin("0.0") BigDecimal incomeTax, @DecimalMin("0.0") BigDecimal providentFund,
			@DecimalMin("0.0") BigDecimal walefareFund, @DecimalMin("0.0") BigDecimal meal,
			@DecimalMin("0.0") BigDecimal otherDeductions, String filler1, String filler2, String filler3,
			String filler4, String filler5, LocalDateTime createdDate, String createdBy, String createdIp,
			LocalDateTime updatedDate, String updatedBy, String updatedIp) {
		super();
		this.employeeId = employeeId;
		this.deductionId = deductionId;
		this.roomCharge = roomCharge;
		this.incomeTax = incomeTax;
		this.providentFund = providentFund;
		this.walefareFund = walefareFund;
		this.meal = meal;
		this.otherDeductions = otherDeductions;
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
	public Long getDeductionId() {
		return deductionId;
	}
	public void setDeductionId(Long deductionId) {
		this.deductionId = deductionId;
	}
	public BigDecimal getRoomCharge() {
		return roomCharge;
	}
	public void setRoomCharge(BigDecimal roomCharge) {
		this.roomCharge = roomCharge;
	}
	public BigDecimal getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(BigDecimal incomeTax) {
		this.incomeTax = incomeTax;
	}
	public BigDecimal getProvidentFund() {
		return providentFund;
	}
	public void setProvidentFund(BigDecimal providentFund) {
		this.providentFund = providentFund;
	}
	public BigDecimal getWalefareFund() {
		return walefareFund;
	}
	public void setWalefareFund(BigDecimal walefareFund) {
		this.walefareFund = walefareFund;
	}
	public BigDecimal getMeal() {
		return meal;
	}
	public void setMeal(BigDecimal meal) {
		this.meal = meal;
	}
	public BigDecimal getOtherDeductions() {
		return otherDeductions;
	}
	public void setOtherDeductions(BigDecimal otherDeductions) {
		this.otherDeductions = otherDeductions;
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
		return "Deduction [employeeId=" + employeeId + ", deductionId=" + deductionId + ", roomCharge=" + roomCharge
				+ ", incomeTax=" + incomeTax + ", providentFund=" + providentFund + ", walefareFund=" + walefareFund
				+ ", meal=" + meal + ", otherDeductions=" + otherDeductions + ", filler1=" + filler1 + ", filler2="
				+ filler2 + ", filler3=" + filler3 + ", filler4=" + filler4 + ", filler5=" + filler5 + ", createdDate="
				+ createdDate + ", createdBy=" + createdBy + ", createdIp=" + createdIp + ", updatedDate=" + updatedDate
				+ ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp + "]";
	}
	

}
