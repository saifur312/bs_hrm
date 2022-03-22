package com.bs.hrm.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeSub {
	
	private long 			employeeId;
	private	String 			NID;
	private	String 			fingerId;
	private String  		fullName;
 	private String	    	nickName;
 	private Double	    	basicSalary;
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getNID() {
		return NID;
	}
	public void setNID(String nID) {
		NID = nID;
	}
	public String getFingerId() {
		return fingerId;
	}
	public void setFingerId(String fingerId) {
		this.fingerId = fingerId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return "EmployeeSub [employeeId=" + employeeId + ", NID=" + NID + ", fingerId=" + fingerId + ", fullName="
				+ fullName + ", nickName=" + nickName + ", basicSalary=" + basicSalary + "]";
	}
 	
 	

}
