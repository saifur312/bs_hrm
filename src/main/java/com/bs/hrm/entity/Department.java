package com.bs.hrm.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="dept")
public class Department {
	
	@Id @GeneratedValue
	private Integer 		departmentId;
	@Column(length=50)
	private String 			departmentName;
	@Column(length=100)
	private String 			description;
	@Column(length=150)
	private String 			responsibilty;
	@Column(length=50)
	private String 			managerName;
	private Integer 		totalEmployee;
	private Integer 		addressId;
	private Integer 		serail;
	private LocalDate 		startDate;
	private LocalDate 		endDate;
	@Transient
	private String 			startDateStr;
	@Transient
	private String 			endDateStr;
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
	
	public Department() {
		
	}
	public Department(Integer departmentId, String departmentName, String description, String responsibilty,
			String managerName, Integer totalEmployee, Integer addressId, Integer serail, LocalDate startDate,
			LocalDate endDate, String startDateStr, String endDateStr, Boolean status, String filler1, String filler2,
			String filler3, String filler4, String filler5, LocalDateTime createdDate, String createdBy,
			String createdIp, LocalDateTime updatedDate, String updatedBy, String updatedIp) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.description = description;
		this.responsibilty = responsibilty;
		this.managerName = managerName;
		this.totalEmployee = totalEmployee;
		this.addressId = addressId;
		this.serail = serail;
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
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getResponsibilty() {
		return responsibilty;
	}
	public void setResponsibilty(String responsibilty) {
		this.responsibilty = responsibilty;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Integer getTotalEmployee() {
		return totalEmployee;
	}
	public void setTotalEmployee(Integer totalEmployee) {
		this.totalEmployee = totalEmployee;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public Integer getSerail() {
		return serail;
	}
	public void setSerail(Integer serail) {
		this.serail = serail;
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
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", description="
				+ description + ", responsibilty=" + responsibilty + ", managerName=" + managerName + ", totalEmployee="
				+ totalEmployee + ", addressId=" + addressId + ", serail=" + serail + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", startDateStr=" + startDateStr + ", endDateStr=" + endDateStr + ", status="
				+ status + ", filler1=" + filler1 + ", filler2=" + filler2 + ", filler3=" + filler3 + ", filler4="
				+ filler4 + ", filler5=" + filler5 + ", createdDate=" + createdDate + ", createdBy=" + createdBy
				+ ", createdIp=" + createdIp + ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy
				+ ", updatedIp=" + updatedIp + "]";
	}	
	
	
}
