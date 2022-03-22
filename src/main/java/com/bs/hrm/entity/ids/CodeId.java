package com.bs.hrm.entity.ids;

import java.io.Serializable;

public class CodeId implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer 		divisionId;
	private Integer 		districtId;
	private Integer 		subDistrictId;
	private Integer 		cityId;
	private Integer 		postalId;
	private Integer 		areaId;
	
	public CodeId() {
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaId == null) ? 0 : areaId.hashCode());
		result = prime * result + ((cityId == null) ? 0 : cityId.hashCode());
		result = prime * result + ((districtId == null) ? 0 : districtId.hashCode());
		result = prime * result + ((divisionId == null) ? 0 : divisionId.hashCode());
		result = prime * result + ((postalId == null) ? 0 : postalId.hashCode());
		result = prime * result + ((subDistrictId == null) ? 0 : subDistrictId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeId other = (CodeId) obj;
		if (areaId == null) {
			if (other.areaId != null)
				return false;
		} else if (!areaId.equals(other.areaId))
			return false;
		if (cityId == null) {
			if (other.cityId != null)
				return false;
		} else if (!cityId.equals(other.cityId))
			return false;
		if (districtId == null) {
			if (other.districtId != null)
				return false;
		} else if (!districtId.equals(other.districtId))
			return false;
		if (divisionId == null) {
			if (other.divisionId != null)
				return false;
		} else if (!divisionId.equals(other.divisionId))
			return false;
		if (postalId == null) {
			if (other.postalId != null)
				return false;
		} else if (!postalId.equals(other.postalId))
			return false;
		if (subDistrictId == null) {
			if (other.subDistrictId != null)
				return false;
		} else if (!subDistrictId.equals(other.subDistrictId))
			return false;
		return true;
	}

	public Integer getDivisionId() {
		return divisionId;
	}
	public void setDivisionId(Integer divisionId) {
		this.divisionId = divisionId;
	}
	public Integer getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	public Integer getSubDistrictId() {
		return subDistrictId;
	}
	public void setSubDistrictId(Integer subDistrictId) {
		this.subDistrictId = subDistrictId;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getPostalId() {
		return postalId;
	}
	public void setPostalId(Integer postalId) {
		this.postalId = postalId;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "CodeId [divisionId=" + divisionId + ", districtId=" + districtId + ", subDistrictId=" + subDistrictId
				+ ", cityId=" + cityId + ", postalId=" + postalId + ", areaId=" + areaId + "]";
	}

}
