package com.bs.hrm.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

import com.bs.hrm.entity.ids.OvertimeId;

@Entity
@IdClass(OvertimeId.class)
public class Overtime {
	@Id
	private Long 			employeeId;
	@Id
	private Long 			overtimeId;
	@Column(length=50)
	private String 			overtimeType;
	private LocalDate		overtimeDate;
	private LocalTime		startTime;
	private LocalTime		endTime;
	@Transient
	private String 			overtimeDateStr;
	@Transient
	private String 			startTimeStr;
	@Transient
	private String 			endTimeStr;
	private Integer			totalHours;
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
	
	public Overtime() {
		
	}
	
	public Overtime(Long employeeId, Long overtimeId, String overtimeType, LocalDate overtimeDate, LocalTime startTime,
			LocalTime endTime, String overtimeDateStr, String startTimeStr, String endTimeStr, Integer totalHours,
			String remarks, Boolean status, String filler1, String filler2, String filler3, String filler4,
			String filler5, LocalDateTime createdDate, String createdBy, String createdIp, LocalDateTime updatedDate,
			String updatedBy, String updatedIp) {
		super();
		this.employeeId = employeeId;
		this.overtimeId = overtimeId;
		this.overtimeType = overtimeType;
		this.overtimeDate = overtimeDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.overtimeDateStr = overtimeDateStr;
		this.startTimeStr = startTimeStr;
		this.endTimeStr = endTimeStr;
		this.totalHours = totalHours;
		this.remarks = remarks;
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

	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getOvertimeId() {
		return overtimeId;
	}
	public void setOvertimeId(Long overtimeId) {
		this.overtimeId = overtimeId;
	}
	public String getOvertimeType() {
		return overtimeType;
	}
	public void setOvertimeType(String overtimeType) {
		this.overtimeType = overtimeType;
	}
	public LocalDate getOvertimeDate() {
		return overtimeDate;
	}
	public void setOvertimeDate(LocalDate overtimeDate) {
		this.overtimeDate = overtimeDate;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public Integer getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(Integer totalHours) {
		this.totalHours = totalHours;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	public String getOvertimeDateStr() {
		return overtimeDateStr;
	}
	public void setOvertimeDateStr(String overtimeDateStr) {
		this.overtimeDateStr = overtimeDateStr;
	}
	public String getStartTimeStr() {
		return startTimeStr;
	}
	public void setStartTimeStr(String startTimeStr) {
		this.startTimeStr = startTimeStr;
	}
	public String getEndTimeStr() {
		return endTimeStr;
	}
	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
	}
	
	@Override
	public String toString() {
		return "Overtime [employeeId=" + employeeId + ", overtimeId=" + overtimeId + ", overtimeType=" + overtimeType
				+ ", overtimeDate=" + overtimeDate + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", overtimeDateStr=" + overtimeDateStr + ", startTimeStr=" + startTimeStr + ", endTimeStr="
				+ endTimeStr + ", totalHours=" + totalHours + ", remarks=" + remarks + ", status=" + status
				+ ", filler1=" + filler1 + ", filler2=" + filler2 + ", filler3=" + filler3 + ", filler4=" + filler4
				+ ", filler5=" + filler5 + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", createdIp="
				+ createdIp + ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp
				+ "]";
	}

}
