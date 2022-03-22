package com.bs.hrm.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.bs.hrm.entity.ids.CodeId;

public class CodeStr {

	private String 		divisionId;

	private String 		districtId;

	private String 		subDistrictId;

	private String 		cityId;

	private String 		postalId;

	private String 		areaId;
	@Column(length=20, nullable=false)
	private String 			codeType;
	@Column(length=50)
	private String 			codeName;
	@Column(length=100)
	private String 			description;
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
	
	public CodeStr() {
		
	}
	
	public CodeStr(String divisionId, String districtId, String subDistrictId, String cityId, String postalId,
			String areaId, String codeType, String codeName, String description, Boolean status, String filler1,
			String filler2, String filler3, String filler4, String filler5, LocalDateTime createdDate, String createdBy,
			String createdIp, LocalDateTime updatedDate, String updatedBy, String updatedIp) {
		super();
		this.divisionId = divisionId;
		this.districtId = districtId;
		this.subDistrictId = subDistrictId;
		this.cityId = cityId;
		this.postalId = postalId;
		this.areaId = areaId;
		this.codeType = codeType;
		this.codeName = codeName;
		this.description = description;
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

	public String getDivisionId() {
		return divisionId;
	}
	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	public String getSubDistrictId() {
		return subDistrictId;
	}
	public void setSubDistrictId(String subDistrictId) {
		this.subDistrictId = subDistrictId;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getPostalId() {
		return postalId;
	}
	public void setPostalId(String postalId) {
		this.postalId = postalId;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getCodeType() {
		return codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
		return "Code [divisionId=" + divisionId + ", districtId=" + districtId + ", subDistrictId=" + subDistrictId
				+ ", cityId=" + cityId + ", postalId=" + postalId + ", areaId=" + areaId + ", codeType=" + codeType
				+ ", codeName=" + codeName + ", description=" + description + ", status=" + status + ", filler1="
				+ filler1 + ", filler2=" + filler2 + ", filler3=" + filler3 + ", filler4=" + filler4 + ", filler5="
				+ filler5 + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", createdIp=" + createdIp
				+ ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp + "]";
	}
	
}
