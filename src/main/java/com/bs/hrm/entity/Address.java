package com.bs.hrm.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.bs.hrm.entity.ids.AddressId;

@Entity
@IdClass(AddressId.class)
@Table(name="address")
public class Address {
	
	@Id
	private Long 			addressId;
	@Id 
	private Long 			employeeId;
	@Column(length=30)
	private String 			addressType;
	private Integer 		divisionCode;
	private Integer 		districtCode;
	private Integer 		subDistrictCode;
	private Integer 		city;
	private Integer 		villageCode;
	private Integer 		postalCode;
	private Integer 		areaCode;
	@Column(length=80)
	private String 			region;
	@Column(length=50)
	private String 			roadNo;
	@Column(length=50)
	private String 			houseNo;
	@Column(length=50)
	private String 			apartmentNo;
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
	
	public Address() {
		
	}
	
	public Address(Long addressId, Long employeeId, String addressType, Integer divisionCode, Integer districtCode,
			Integer subDistrictCode, Integer city, Integer villageCode, Integer postalCode, Integer areaCode,
			String region, String roadNo, String houseNo, String apartmentNo, Boolean status, String filler1,
			String filler2, String filler3, String filler4, String filler5, LocalDateTime createdDate, String createdBy,
			String createdIp, LocalDateTime updatedDate, String updatedBy, String updatedIp) {
		super();
		this.addressId = addressId;
		this.employeeId = employeeId;
		this.addressType = addressType;
		this.divisionCode = divisionCode;
		this.districtCode = districtCode;
		this.subDistrictCode = subDistrictCode;
		this.city = city;
		this.villageCode = villageCode;
		this.postalCode = postalCode;
		this.areaCode = areaCode;
		this.region = region;
		this.roadNo = roadNo;
		this.houseNo = houseNo;
		this.apartmentNo = apartmentNo;
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

	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public Integer getDivisionCode() {
		return divisionCode;
	}
	public void setDivisionCode(Integer divisionCode) {
		this.divisionCode = divisionCode;
	}
	public Integer getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(Integer districtCode) {
		this.districtCode = districtCode;
	}
	public Integer getSubDistrictCode() {
		return subDistrictCode;
	}
	public void setSubDistrictCode(Integer subDistrictCode) {
		this.subDistrictCode = subDistrictCode;
	}
	public Integer getCity() {
		return city;
	}
	public void setCity(Integer city) {
		this.city = city;
	}
	public Integer getVillageCode() {
		return villageCode;
	}
	public void setVillageCode(Integer villageCode) {
		this.villageCode = villageCode;
	}
	public Integer getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRoadNo() {
		return roadNo;
	}
	public void setRoadNo(String roadNo) {
		this.roadNo = roadNo;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getApartmentNo() {
		return apartmentNo;
	}
	public void setApartmentNo(String apartmentNo) {
		this.apartmentNo = apartmentNo;
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
		return "Address [addressId=" + addressId + ", employeeId=" + employeeId + ", addressType=" + addressType
				+ ", divisionCode=" + divisionCode + ", districtCode=" + districtCode + ", subDistrictCode="
				+ subDistrictCode + ", city=" + city + ", villageCode=" + villageCode + ", postalCode=" + postalCode
				+ ", areaCode=" + areaCode + ", region=" + region + ", roadNo=" + roadNo + ", houseNo=" + houseNo
				+ ", apartmentNo=" + apartmentNo + ", status=" + status + ", filler1=" + filler1 + ", filler2="
				+ filler2 + ", filler3=" + filler3 + ", filler4=" + filler4 + ", filler5=" + filler5 + ", createdDate="
				+ createdDate + ", createdBy=" + createdBy + ", createdIp=" + createdIp + ", updatedDate=" + updatedDate
				+ ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp + "]";
	}
	
	
}
