package com.bs.hrm.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;
import javax.validation.constraints.DecimalMin;

import com.bs.hrm.entity.ids.LoanId;
import com.bs.hrm.entity.ids.MonthlySalaryEntityId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@IdClass(LoanId.class)
/*
 * @NoArgsConstructor
 * 
 * @AllArgsConstructor
 * 
 * @Data
 */
public class Loan {
	@Id
	private Long 			employeeId;
	@Id
	private Long 			loanId;
	@DecimalMin(value = "0.0")
	private BigDecimal 		loanAmount;
	private BigDecimal 		deductionAmount;
	private LocalDate		transactionDate;
	private LocalDate		loanEndDate;
	@Transient
	private String 			transactionDateStr;
	@Transient
	private String 			loanEndDateStr;
	@Column(length=50)
	private String 			deductionType;
	@Column(length=150)
	private String 			remarks;	
 	private Boolean	    	status;
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
	
	
	  public Loan() {
	  
	  }
	  
	  public Loan(Long employeeId, Long loanId, @DecimalMin("0.0") BigDecimal
	  loanAmount, LocalDate transactionDate, String transactionDateStr, String
	  deductionType, String remarks, Boolean status, String filler1, String
	  filler2, String filler3, String filler4, String filler5, LocalDateTime
	  createdDate, String createdBy, String createdIp, LocalDateTime updatedDate,
	  String updatedBy, String updatedIp) { super(); this.employeeId = employeeId;
	  this.loanId = loanId; this.loanAmount = loanAmount; this.transactionDate =
	  transactionDate; this.transactionDateStr = transactionDateStr;
	  this.deductionType = deductionType; this.remarks = remarks; this.status =
	  status; this.filler1 = filler1; this.filler2 = filler2; this.filler3 =
	  filler3; this.filler4 = filler4; this.filler5 = filler5; this.createdDate =
	  createdDate; this.createdBy = createdBy; this.createdIp = createdIp;
	  this.updatedDate = updatedDate; this.updatedBy = updatedBy; this.updatedIp =
	  updatedIp; }
	  
	  public Long getEmployeeId() { return employeeId; } public void
	  setEmployeeId(Long employeeId) { this.employeeId = employeeId; } public Long
	  getLoanId() { return loanId; } public void setLoanId(Long loanId) {
	  this.loanId = loanId; } public BigDecimal getLoanAmount() { return
	  loanAmount; } public void setLoanAmount(BigDecimal loanAmount) {
	  this.loanAmount = loanAmount; } public LocalDate getTransactionDate() {
	  return transactionDate; } public void setTransactionDate(LocalDate
	  transactionDate) { this.transactionDate = transactionDate; } public String
	  getDeductionType() { return deductionType; } public void
	  setDeductionType(String deductionType) { this.deductionType = deductionType;
	  } public Boolean getStatus() { return status; } public void setStatus(Boolean
	  status) { this.status = status; } public String getFiller1() { return
	  filler1; } public void setFiller1(String filler1) { this.filler1 = filler1; }
	  public String getFiller2() { return filler2; } public void setFiller2(String
	  filler2) { this.filler2 = filler2; } public String getFiller3() { return
	  filler3; } public void setFiller3(String filler3) { this.filler3 = filler3; }
	  public String getFiller4() { return filler4; } public void setFiller4(String
	  filler4) { this.filler4 = filler4; } public String getFiller5() { return
	  filler5; } public void setFiller5(String filler5) { this.filler5 = filler5; }
	  public LocalDateTime getCreatedDate() { return createdDate; } public void
	  setCreatedDate(LocalDateTime createdDate) { this.createdDate = createdDate; }
	  public String getCreatedBy() { return createdBy; } public void
	  setCreatedBy(String createdBy) { this.createdBy = createdBy; } public String
	  getCreatedIp() { return createdIp; } public void setCreatedIp(String
	  createdIp) { this.createdIp = createdIp; } public LocalDateTime
	  getUpdatedDate() { return updatedDate; } public void
	  setUpdatedDate(LocalDateTime updatedDate) { this.updatedDate = updatedDate; }
	  public String getUpdatedBy() { return updatedBy; } public void
	  setUpdatedBy(String updatedBy) { this.updatedBy = updatedBy; } public String
	  getUpdatedIp() { return updatedIp; } public void setUpdatedIp(String
	  updatedIp) { this.updatedIp = updatedIp; } public String
	  getTransactionDateStr() { return transactionDateStr; } public void
	  setTransactionDateStr(String transactionDateStr) { this.transactionDateStr =
	  transactionDateStr; } public String getRemarks() { return remarks; } public
	  void setRemarks(String remarks) { this.remarks = remarks; }
	  
	  @Override public String toString() { return "Loan [employeeId=" + employeeId
	  + ", loanId=" + loanId + ", loanAmount=" + loanAmount + ", transactionDate="
	  + transactionDate + ", transactionDateStr=" + transactionDateStr +
	  ", deductionType=" + deductionType + ", remarks=" + remarks + ", status=" +
	  status + ", filler1=" + filler1 + ", filler2=" + filler2 + ", filler3=" +
	  filler3 + ", filler4=" + filler4 + ", filler5=" + filler5 + ", createdDate="
	  + createdDate + ", createdBy=" + createdBy + ", createdIp=" + createdIp +
	  ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", updatedIp="
	  + updatedIp + "]"; }
	 

}
