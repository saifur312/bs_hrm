package com.bs.hrm.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

import com.bs.hrm.entity.ids.ExperienceId;

@Entity
@IdClass(ExperienceId.class)
public class Experience {
	@Id
	private LocalDate       lastActiveDate;
	@Id 
	private Long 			employeeId;
	@Transient
	private String       	lastActiveDateStr;
	@Column(length=100)
 	private String	    	companyName;
	@Column(length=80)
 	private String	    	designation;
	
	  @Column(length=150)
	  private String responsibilities; 
	  private LocalDate startDate; 
	  private LocalDate endDate;
	  
	  @Transient private String startDateStr;
	  
	  @Transient private String endDateStr;
	  
	  @Transient private Boolean status;
	  
	  @Column(length=80) private String filler1;
	  
	  @Column(length=80) private String filler2;
	  
	  @Column(length=80) private String filler3;
	  
	  @Column(length=80) private String filler4;
	  
	  @Column(length=80) private String filler5; 
	  
	  private LocalDateTime createdDate;
	  
	  @Column(length=30) private String createdBy;
	  
	  @Column(length=50) private String createdIp; 
	  private LocalDateTime updatedDate;
	  
	  @Column(length=30) private String updatedBy;
	  
	  @Column(length=40) private String updatedIp;
	public Experience() {
		
	}
	public Experience(LocalDate lastActiveDate, Long employeeId, String lastActiveDateStr, String companyName,
			String designation, String responsibilities, LocalDate startDate, LocalDate endDate, String startDateStr,
			String endDateStr, Boolean status, String filler1, String filler2, String filler3, String filler4,
			String filler5, LocalDateTime createdDate, String createdBy, String createdIp, LocalDateTime updatedDate,
			String updatedBy, String updatedIp) {
		super();
		this.lastActiveDate = lastActiveDate;
		this.employeeId = employeeId;
		this.lastActiveDateStr = lastActiveDateStr;
		this.companyName = companyName;
		this.designation = designation;
		this.responsibilities = responsibilities;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startDateStr = startDateStr;
		this.endDateStr = endDateStr;
		this.status = status;
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
	public String getLastActiveDateStr() {
		return lastActiveDateStr;
	}
	public void setLastActiveDateStr(String lastActiveDateStr) {
		this.lastActiveDateStr = lastActiveDateStr;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getResponsibilities() {
		return responsibilities;
	}
	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getStartDateStr() {
		return startDateStr;
	}
	public void setStartDateStr(String startDateStr) {
		this.startDateStr = startDateStr;
	}
	public String getEndDateStr() {
		return endDateStr;
	}
	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
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
		return "Experience [lastActiveDate=" + lastActiveDate + ", employeeId=" + employeeId + ", lastActiveDateStr="
				+ lastActiveDateStr + ", companyName=" + companyName + ", designation=" + designation
				+ ", responsibilities=" + responsibilities + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", startDateStr=" + startDateStr + ", endDateStr=" + endDateStr + ", status=" + status + ", filler1="
				+ filler1 + ", filler2=" + filler2 + ", filler3=" + filler3 + ", filler4=" + filler4 + ", filler5="
				+ filler5 + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", createdIp=" + createdIp
				+ ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp + "]";
	}
}
