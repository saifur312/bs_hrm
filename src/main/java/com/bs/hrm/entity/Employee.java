 /*******************************************************************************
 Author: Md. Saifur Rahman
 Created Date: 03-Jan-2021
 Last Update: 06-Jan-2021
 
 *******************************************************************************/

package com.bs.hrm.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.bs.hrm.dto.EmployeeDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name="employee", schema="hrdb")
/*
 * @NoArgsConstructor
 * 
 * @AllArgsConstructor
 * 
 * @Data
 */
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long 			employeeId;
	@Column(length=30, nullable=false, unique=true)
	private	String 			NID;
	@Column(length=20, unique=true)
	private	String 			fingerId;
	@Column(length=50, nullable=false)
	private String  		fullName;
	@Column(length=20)
 	private String	    	nickName;
	/*@Column(length=20)
 	private String	    	employeeType;*/
 	private int	    		departmentId;
 	private int	    		sectionId;
 	private int	    		jobId; 
 	private int	    		categoryId;
 	private int	    		addressId;
	@Column(length=20)
	private String	    	religion;
	@Column(length=15)
	private String	    	gender;
	@Column(length=20)
 	private String	    	mobileNo;
	@Column(length=20)
 	private String	    	landPhone;
	@Column(length=50)
 	private String	    	email;
	@Column(length=30)
 	private String	    	tin;
 	private int	    		pfID;
 	private LocalDate		pfJoinDate;
	private LocalDate		dob;
 	private LocalDate		appliacationDate;
 	private LocalDate		interviewDate;
 	private LocalDate		joinDate;
 	private LocalDate		confirmDate;
 	private LocalDate		finalSettleDate;
 	private LocalDate		incrementDate;
 	private LocalDate		promotionDate;
 	private LocalDate		retiermentDate;
	@Column(length=30)
 	private String	    	nationality;
	@Column(length=20)
 	private String	    	emergencyContact;
	@Column(length=10)
 	private String	    	bloodGroup;
	@Column(length=20)
 	private String	    	maritalStatus;
	@Column(precision=12, scale=2)
 	private Double	    	basicSalary;
 	private int	    		grade;
 	private int	        	leaveBalance;
	@Column(length=10)
 	private String	    	status;
	@Lob
	private byte[] 			employeeImage;
	@Transient
    private MultipartFile 	imageFile;
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
	
	public Employee() {
		
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
		return "Employee [employeeId=" + employeeId + ", NID=" + NID + ", fingerId=" + fingerId + ", fullName="
				+ fullName + ", nickName=" + nickName + ", departmentId=" + departmentId + ", sectionId=" + sectionId
				+ ", jobId=" + jobId + ", categoryId=" + categoryId + ", addressId=" + addressId + ", religion="
				+ religion + ", gender=" + gender + ", mobileNo=" + mobileNo + ", landPhone=" + landPhone + ", email="
				+ email + ", tin=" + tin + ", pfID=" + pfID + ", pfJoinDate=" + pfJoinDate + ", dob=" + dob
				+ ", appliacationDate=" + appliacationDate + ", interviewDate=" + interviewDate + ", joinDate="
				+ joinDate + ", confirmDate=" + confirmDate + ", finalSettleDate=" + finalSettleDate
				+ ", incrementDate=" + incrementDate + ", promotionDate=" + promotionDate + ", retiermentDate="
				+ retiermentDate + ", nationality=" + nationality + ", emergencyContact=" + emergencyContact
				+ ", bloodGroup=" + bloodGroup + ", maritalStatus=" + maritalStatus + ", basicSalary=" + basicSalary
				+ ", grade=" + grade + ", leaveBalance=" + leaveBalance + ", status=" + status + ", employeeImage="
				+ Arrays.toString(employeeImage) + ", imageFile=" + imageFile + ", filler1=" + filler1 + ", filler2="
				+ filler2 + ", filler3=" + filler3 + ", filler4=" + filler4 + ", filler5=" + filler5 + ", createdDate="
				+ createdDate + ", createdBy=" + createdBy + ", createdIp=" + createdIp + ", updatedDate=" + updatedDate
				+ ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp + "]";
	}
	 
	
 	
 	

}
