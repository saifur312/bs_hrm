package com.bs.hrm.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@IdClass(EducationId.class)
@Table(name="education")
public class Education {
	@Id 
	private Long 			employeeId;
	@Id
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate       completionDate;
	@Transient
	private String       	completionDateStr;
	@Column(length=100)
 	private String	    	certificate;
	@Column(length=150)
 	private String	    	institute;
	@Column(length=50)
	private String 			studyGroup;
	@Column(length=50)
 	private String	    	result;
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
	
	public Education() {
		
	}
	
	public Education(LocalDate completionDate, Long employeeId, String completionDateStr, String certificate,
			String institute, String studyGroup, String result, Boolean status, String filler1, String filler2,
			String filler3, String filler4, String filler5, LocalDateTime createdDate, String createdBy,
			String createdIp, LocalDateTime updatedDate, String updatedBy, String updatedIp) {
		super();
		this.completionDate = completionDate;
		this.employeeId = employeeId;
		this.completionDateStr = completionDateStr;
		this.certificate = certificate;
		this.institute = institute;
		this.studyGroup = studyGroup;
		this.result = result;
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
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	// group is a mysql reserve keyword so rename it 
	public String getResult() {
		return result;
	}
	public String getStudyGroup() {
		return studyGroup;
	}
	public void setStudyGroup(String studyGroup) {
		this.studyGroup = studyGroup;
	}
	public void setResult(String result) {
		this.result = result;
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

	public String getCompletionDateStr() {
		return completionDateStr;
	}

	public void setCompletionDateStr(String completionDateStr) {
		this.completionDateStr = completionDateStr;
	}
	
	@Override
	public String toString() {
		return "Education [completionDate=" + completionDate + ", employeeId=" + employeeId + ", completionDateStr="
				+ completionDateStr + ", certificate=" + certificate + ", institute=" + institute + ", studyGroup="
				+ studyGroup + ", result=" + result + ", status=" + status + ", filler1=" + filler1 + ", filler2="
				+ filler2 + ", filler3=" + filler3 + ", filler4=" + filler4 + ", filler5=" + filler5 + ", createdDate="
				+ createdDate + ", createdBy=" + createdBy + ", createdIp=" + createdIp + ", updatedDate=" + updatedDate
				+ ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp + "]";
	}
	
}
