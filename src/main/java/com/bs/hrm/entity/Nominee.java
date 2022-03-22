package com.bs.hrm.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.bs.hrm.entity.ids.NomineeIdentity;

@Entity
public class Nominee {
	@EmbeddedId 
	private NomineeIdentity		nomineeIdentity;
	@Column(length=30)
	private	String 			NID;  //NID of nominee
	@Column(length=50)
	private String  		firstName;
	@Column(length=50)
	private String  		lastName;
	@Column(length=50)
	private String  		relation;
	private Long  			addressId;
	@Column(length=20)
	private String  		contact;
	@Column(length=40)
	private String  		email;
	private LocalDate		dob;
	@Transient
	private String			dobStr;
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
	@Lob
	private byte[] 			nomineeImage;
	@Transient
    private MultipartFile 	nomineeImageFile;
	
	public Nominee() {
		
	}
	
	public Nominee(NomineeIdentity nomineeIdentity, String nID, String firstName, String lastName, String relation,
			Long addressId, String contact, String email, LocalDate dob, String dobStr, Boolean status, String filler1,
			String filler2, String filler3, String filler4, String filler5, LocalDateTime createdDate, String createdBy,
			String createdIp, LocalDateTime updatedDate, String updatedBy, String updatedIp, byte[] nomineeImage,
			MultipartFile nomineeImageFile) {
		super();
		this.nomineeIdentity = nomineeIdentity;
		NID = nID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.relation = relation;
		this.addressId = addressId;
		this.contact = contact;
		this.email = email;
		this.dob = dob;
		this.dobStr = dobStr;
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
		this.nomineeImage = nomineeImage;
		this.nomineeImageFile = nomineeImageFile;
	}

	public NomineeIdentity getNomineeIdentity() {
		return nomineeIdentity;
	}
	public void setNomineeIdentity(NomineeIdentity nomineeIdentity) {
		this.nomineeIdentity = nomineeIdentity;
	}
	public String getNID() {
		return NID;
	}
	public void setNID(String nID) {
		NID = nID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getDobStr() {
		return dobStr;
	}
	public void setDobStr(String dobStr) {
		this.dobStr = dobStr;
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
	public byte[] getNomineeImage() {
		return nomineeImage;
	}
	public void setNomineeImage(byte[] nomineeImage) {
		this.nomineeImage = nomineeImage;
	}
	public MultipartFile getNomineeImageFile() {
		return nomineeImageFile;
	}
	public void setNomineeImageFile(MultipartFile nomineeImageFile) {
		this.nomineeImageFile = nomineeImageFile;
	}

	@Override
	public String toString() {
		return "Nominee [nomineeIdentity=" + nomineeIdentity + ", NID=" + NID + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", relation=" + relation + ", addressId=" + addressId + ", contact="
				+ contact + ", email=" + email + ", dob=" + dob + ", dobStr=" + dobStr + ", status=" + status
				+ ", filler1=" + filler1 + ", filler2=" + filler2 + ", filler3=" + filler3 + ", filler4=" + filler4
				+ ", filler5=" + filler5 + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", createdIp="
				+ createdIp + ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp
				+ ", nomineeImage=" + Arrays.toString(nomineeImage) + ", nomineeImageFile=" + nomineeImageFile + "]";
	}
	
}
