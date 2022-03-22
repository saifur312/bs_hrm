 /*******************************************************************************
 Author: Md. Saifur Rahman
 Created Date: 03-Jan-2021
 Last Update: 06-Jan-2021
 
 *******************************************************************************/

package com.bs.hrm.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*@NoArgsConstructor
@AllArgsConstructor
@Data*/

public class EmployeeDto {
	
	private long 			employeeId;
	private	String 			NID;
	private	String 			fingerId;
	private String  		fullName;
 	private String	    	nickName;
 	private int	    		departmentId;
 	private int	    		sectionId;
 	private int	    		jobId;
 	private int	    		categoryId;
 	private int	    		addressId;
	private String	    	religion;
	private String	    	gender;
 	private String	    	mobileNo;
 	private String	    	landPhone;
 	private String	    	email;
 	private String	    	tin;
 	private int	    		pfID;
 	private LocalDate		pfJoinDate;
	private LocalDate		dob;
 	private String			pfJoinDateStr;
	private String			dobStr;
	private int				age;
 	private LocalDate		appliacationDate;
 	private LocalDate		interviewDate;
 	private LocalDate		joinDate;
 	private LocalDate		confirmDate;
 	private LocalDate		finalSettleDate;
 	private LocalDate		incrementDate;
 	private LocalDate		promotionDate;
 	private LocalDate		retiermentDate;
 	private String			appliacationDateStr;
 	private String			interviewDateStr;
 	private String			joinDateStr;
 	private String			confirmDateStr;
 	private String			finalSettleDateStr;
 	private String			incrementDateStr;
 	private String			promotionDateStr;
 	private String			retiermentDateStr;
 	private String	    	nationality;
 	private String	    	emergencyContact;
 	private String	    	bloodGroup;
 	private String	    	maritalStatus;
 	private Double	    	basicSalary;
 	private int	    		grade;
 	private int	        	leaveBalance;
 	private String	    	status;
	private byte[] 			employeeImage;
    private MultipartFile 	imageFile;
 	private String	    	filler1;
 	private String	    	filler2;
 	private String	    	filler3;
 	private String	    	filler4;
 	private String	    	filler5;
 	private LocalDateTime   createdDate;
 	private String	    	createdBy;
 	private String	    	createdIp;
 	private LocalDateTime 	updatedDate;
 	private String	    	updatedBy;
 	private String	    	updatedIp;
 	
 	
	public EmployeeDto(long employeeId, String nID, String fingerId, String fullName, String nickName, int departmentId,
			int sectionId, int jobId, int categoryId, int addressId, String religion, String gender, String mobileNo,
			String landPhone, String email, String tin, int pfID, LocalDate pfJoinDate, LocalDate dob,
			String pfJoinDateStr, String dobStr, int age, LocalDate appliacationDate, LocalDate interviewDate,
			LocalDate joinDate, LocalDate confirmDate, LocalDate finalSettleDate, LocalDate incrementDate,
			LocalDate promotionDate, LocalDate retiermentDate, String appliacationDateStr, String interviewDateStr,
			String joinDateStr, String confirmDateStr, String finalSettleDateStr, String incrementDateStr,
			String promotionDateStr, String retiermentDateStr, String nationality, String emergencyContact,
			String bloodGroup, String maritalStatus, Double basicSalary, int grade, int leaveBalance, String status,
			byte[] employeeImage, MultipartFile imageFile, String filler1, String filler2, String filler3,
			String filler4, String filler5, LocalDateTime createdDate, String createdBy, String createdIp,
			LocalDateTime updatedDate, String updatedBy, String updatedIp) {
		super();
		this.employeeId = employeeId;
		NID = nID;
		this.fingerId = fingerId;
		this.fullName = fullName;
		this.nickName = nickName;
		this.departmentId = departmentId;
		this.sectionId = sectionId;
		this.jobId = jobId;
		this.categoryId = categoryId;
		this.addressId = addressId;
		this.religion = religion;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.landPhone = landPhone;
		this.email = email;
		this.tin = tin;
		this.pfID = pfID;
		this.pfJoinDate = pfJoinDate;
		this.dob = dob;
		this.pfJoinDateStr = pfJoinDateStr;
		this.dobStr = dobStr;
		this.age = age;
		this.appliacationDate = appliacationDate;
		this.interviewDate = interviewDate;
		this.joinDate = joinDate;
		this.confirmDate = confirmDate;
		this.finalSettleDate = finalSettleDate;
		this.incrementDate = incrementDate;
		this.promotionDate = promotionDate;
		this.retiermentDate = retiermentDate;
		this.appliacationDateStr = appliacationDateStr;
		this.interviewDateStr = interviewDateStr;
		this.joinDateStr = joinDateStr;
		this.confirmDateStr = confirmDateStr;
		this.finalSettleDateStr = finalSettleDateStr;
		this.incrementDateStr = incrementDateStr;
		this.promotionDateStr = promotionDateStr;
		this.retiermentDateStr = retiermentDateStr;
		this.nationality = nationality;
		this.emergencyContact = emergencyContact;
		this.bloodGroup = bloodGroup;
		this.maritalStatus = maritalStatus;
		this.basicSalary = basicSalary;
		this.grade = grade;
		this.leaveBalance = leaveBalance;
		this.status = status;
		this.employeeImage = employeeImage;
		this.imageFile = imageFile;
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
	public EmployeeDto() {
		// TODO Auto-generated constructor stub
	}
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
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getSectionId() {
		return sectionId;
	}
	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getLandPhone() {
		return landPhone;
	}
	public void setLandPhone(String landPhone) {
		this.landPhone = landPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		this.tin = tin;
	}
	public int getPfID() {
		return pfID;
	}
	public void setPfID(int pfID) {
		this.pfID = pfID;
	}
	public LocalDate getPfJoinDate() {
		return pfJoinDate;
	}
	public void setPfJoinDate(LocalDate pfJoinDate) {
		this.pfJoinDate = pfJoinDate;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getPfJoinDateStr() {
		return pfJoinDateStr;
	}
	public void setPfJoinDateStr(String pfJoinDateStr) {
		this.pfJoinDateStr = pfJoinDateStr;
	}
	public String getDobStr() {
		return dobStr;
	}
	public void setDobStr(String dobStr) {
		this.dobStr = dobStr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getAppliacationDate() {
		return appliacationDate;
	}
	public void setAppliacationDate(LocalDate appliacationDate) {
		this.appliacationDate = appliacationDate;
	}
	public LocalDate getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(LocalDate interviewDate) {
		this.interviewDate = interviewDate;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	public LocalDate getConfirmDate() {
		return confirmDate;
	}
	public void setConfirmDate(LocalDate confirmDate) {
		this.confirmDate = confirmDate;
	}
	public LocalDate getFinalSettleDate() {
		return finalSettleDate;
	}
	public void setFinalSettleDate(LocalDate finalSettleDate) {
		this.finalSettleDate = finalSettleDate;
	}
	public LocalDate getIncrementDate() {
		return incrementDate;
	}
	public void setIncrementDate(LocalDate incrementDate) {
		this.incrementDate = incrementDate;
	}
	public LocalDate getPromotionDate() {
		return promotionDate;
	}
	public void setPromotionDate(LocalDate promotionDate) {
		this.promotionDate = promotionDate;
	}
	public LocalDate getRetiermentDate() {
		return retiermentDate;
	}
	public void setRetiermentDate(LocalDate retiermentDate) {
		this.retiermentDate = retiermentDate;
	}
	public String getAppliacationDateStr() {
		return appliacationDateStr;
	}
	public void setAppliacationDateStr(String appliacationDateStr) {
		this.appliacationDateStr = appliacationDateStr;
	}
	public String getInterviewDateStr() {
		return interviewDateStr;
	}
	public void setInterviewDateStr(String interviewDateStr) {
		this.interviewDateStr = interviewDateStr;
	}
	public String getJoinDateStr() {
		return joinDateStr;
	}
	public void setJoinDateStr(String joinDateStr) {
		this.joinDateStr = joinDateStr;
	}
	public String getConfirmDateStr() {
		return confirmDateStr;
	}
	public void setConfirmDateStr(String confirmDateStr) {
		this.confirmDateStr = confirmDateStr;
	}
	public String getFinalSettleDateStr() {
		return finalSettleDateStr;
	}
	public void setFinalSettleDateStr(String finalSettleDateStr) {
		this.finalSettleDateStr = finalSettleDateStr;
	}
	public String getIncrementDateStr() {
		return incrementDateStr;
	}
	public void setIncrementDateStr(String incrementDateStr) {
		this.incrementDateStr = incrementDateStr;
	}
	public String getPromotionDateStr() {
		return promotionDateStr;
	}
	public void setPromotionDateStr(String promotionDateStr) {
		this.promotionDateStr = promotionDateStr;
	}
	public String getRetiermentDateStr() {
		return retiermentDateStr;
	}
	public void setRetiermentDateStr(String retiermentDateStr) {
		this.retiermentDateStr = retiermentDateStr;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public Double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getLeaveBalance() {
		return leaveBalance;
	}
	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public byte[] getEmployeeImage() {
		return employeeImage;
	}
	public void setEmployeeImage(byte[] employeeImage) {
		this.employeeImage = employeeImage;
	}
	public MultipartFile getImageFile() {
		return imageFile;
	}
	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
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
		return "EmployeeDto [employeeId=" + employeeId + ", NID=" + NID + ", fingerId=" + fingerId + ", fullName="
				+ fullName + ", nickName=" + nickName + ", departmentId=" + departmentId + ", sectionId=" + sectionId
				+ ", jobId=" + jobId + ", categoryId=" + categoryId + ", addressId=" + addressId + ", religion="
				+ religion + ", gender=" + gender + ", mobileNo=" + mobileNo + ", landPhone=" + landPhone + ", email="
				+ email + ", tin=" + tin + ", pfID=" + pfID + ", pfJoinDate=" + pfJoinDate + ", dob=" + dob
				+ ", pfJoinDateStr=" + pfJoinDateStr + ", dobStr=" + dobStr + ", age=" + age + ", appliacationDate="
				+ appliacationDate + ", interviewDate=" + interviewDate + ", joinDate=" + joinDate + ", confirmDate="
				+ confirmDate + ", finalSettleDate=" + finalSettleDate + ", incrementDate=" + incrementDate
				+ ", promotionDate=" + promotionDate + ", retiermentDate=" + retiermentDate + ", appliacationDateStr="
				+ appliacationDateStr + ", interviewDateStr=" + interviewDateStr + ", joinDateStr=" + joinDateStr
				+ ", confirmDateStr=" + confirmDateStr + ", finalSettleDateStr=" + finalSettleDateStr
				+ ", incrementDateStr=" + incrementDateStr + ", promotionDateStr=" + promotionDateStr
				+ ", retiermentDateStr=" + retiermentDateStr + ", nationality=" + nationality + ", emergencyContact="
				+ emergencyContact + ", bloodGroup=" + bloodGroup + ", maritalStatus=" + maritalStatus
				+ ", basicSalary=" + basicSalary + ", grade=" + grade + ", leaveBalance=" + leaveBalance + ", status="
				+ status + ", employeeImage=" + Arrays.toString(employeeImage) + ", imageFile=" + imageFile
				+ ", filler1=" + filler1 + ", filler2=" + filler2 + ", filler3=" + filler3 + ", filler4=" + filler4
				+ ", filler5=" + filler5 + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", createdIp="
				+ createdIp + ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp
				+ "]";
	}
 	
 	
}
