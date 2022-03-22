package com.bs.hrm.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.bs.hrm.entity.ids.DependentsIdentity;
@Entity
@IdClass(DependentsIdentity.class)
public class Dependent {
	
	@Id
	private Long 			dependentsId;
	@Id
	private Long 			employeeId;
	@Column(length=30)
	private	String 			NID; //NID of dependents
	@Column(length=50, nullable=false)
	private String  		name;
	@Column(length=20)
 	private String	    	nickName;
	@Column(length=10)
 	private String	    	bloodGroup;
	@Column(length=40)
 	private String	    	relationship;
	@Column(length=80)
 	private String	    	nomineeName;
	@Column(length=40)
 	private String	    	nomineeNID;
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
	
	public Dependent() {
		
	}
	
	public Dependent(Long employeeId, Long dependentsId ) {
		super();
		this.employeeId = employeeId;
		this.dependentsId = dependentsId;
	}
	
	public Dependent(Long dependentsId, Long employeeId, String nID, String name, String nickName,
			String bloodGroup, String relationship, String nomineeName, String nomineeNID, Boolean status, String filler1, String filler2, String filler3,
			String filler4, String filler5, LocalDateTime createdDate, String createdBy, String createdIp,
			LocalDateTime updatedDate, String updatedBy, String updatedIp) {
		super();
		this.dependentsId = dependentsId;
		this.employeeId = employeeId;
		NID = nID;
		this.name = name;
		this.nickName = nickName;
		this.bloodGroup = bloodGroup;
		this.relationship = relationship;
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
		this.nomineeName = nomineeName;
		this.nomineeNID = nomineeNID;
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
	public String getNID() {
		return NID;
	}
	public void setNID(String nID) {
		NID = nID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
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
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public String getNomineeNID() {
		return nomineeNID;
	}
	public void setNomineeNID(String nomineeNID) {
		this.nomineeNID = nomineeNID;
	}

	@Override
	public String toString() {
		return "Dependent [dependentsId=" + dependentsId + ", employeeId=" + employeeId + ", NID=" + NID + ", name="
				+ name + ", nickName=" + nickName + ", bloodGroup=" + bloodGroup + ", relationship=" + relationship
				+ ", nomineeName=" + nomineeName + ", nomineeNID=" + nomineeNID + ", status=" + status + ", filler1="
				+ filler1 + ", filler2=" + filler2 + ", filler3=" + filler3 + ", filler4=" + filler4 + ", filler5="
				+ filler5 + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", createdIp=" + createdIp
				+ ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp + "]";
	}
	
	
}
