package com.bs.hrm.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TotalSalary {

	private Integer	year;
	private Integer month;
	private String monthStr;
	private String employeeType;
	private BigDecimal basicSalary;
	private BigDecimal overtimeAmount;
	private BigDecimal allowance;
	private BigDecimal totalSalary;
	private BigDecimal loanDeduction;
	private BigDecimal netSalary;
	private LocalDate salaryDate;
	private Integer 		departmentId;
	
	private String filler1;
	private String filler2;
	private String filler3;
	private String filler4;
	private String filler5;
	private String filler6;
	private String filler7;
	private String filler8;
	private String filler9;
	private String filler10;
	private String filler11;
	private String filler12;
	private String filler13;
	private String filler14;
	private String filler15;
	private String filler16;
	private String filler17;
	private String filler18;
	private String filler19;
	private String filler20;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
	private String createdBy;
	private String createdIp; 
	private String updatedBy;
	private String updatedIp;
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public String getMonthStr() {
		return monthStr;
	}
	public void setMonthStr(String monthStr) {
		this.monthStr = monthStr;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public BigDecimal getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(BigDecimal basicSalary) {
		this.basicSalary = basicSalary;
	}
	public BigDecimal getOvertimeAmount() {
		return overtimeAmount;
	}
	public void setOvertimeAmount(BigDecimal overtimeAmount) {
		this.overtimeAmount = overtimeAmount;
	}
	public BigDecimal getAllowance() {
		return allowance;
	}
	public void setAllowance(BigDecimal allowance) {
		this.allowance = allowance;
	}
	public BigDecimal getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(BigDecimal totalSalary) {
		this.totalSalary = totalSalary;
	}
	public BigDecimal getLoanDeduction() {
		return loanDeduction;
	}
	public void setLoanDeduction(BigDecimal loanDeduction) {
		this.loanDeduction = loanDeduction;
	}
	public BigDecimal getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(BigDecimal netSalary) {
		this.netSalary = netSalary;
	}
	public LocalDate getSalaryDate() {
		return salaryDate;
	}
	public void setSalaryDate(LocalDate salaryDate) {
		this.salaryDate = salaryDate;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
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
	public String getFiller6() {
		return filler6;
	}
	public void setFiller6(String filler6) {
		this.filler6 = filler6;
	}
	public String getFiller7() {
		return filler7;
	}
	public void setFiller7(String filler7) {
		this.filler7 = filler7;
	}
	public String getFiller8() {
		return filler8;
	}
	public void setFiller8(String filler8) {
		this.filler8 = filler8;
	}
	public String getFiller9() {
		return filler9;
	}
	public void setFiller9(String filler9) {
		this.filler9 = filler9;
	}
	public String getFiller10() {
		return filler10;
	}
	public void setFiller10(String filler10) {
		this.filler10 = filler10;
	}
	public String getFiller11() {
		return filler11;
	}
	public void setFiller11(String filler11) {
		this.filler11 = filler11;
	}
	public String getFiller12() {
		return filler12;
	}
	public void setFiller12(String filler12) {
		this.filler12 = filler12;
	}
	public String getFiller13() {
		return filler13;
	}
	public void setFiller13(String filler13) {
		this.filler13 = filler13;
	}
	public String getFiller14() {
		return filler14;
	}
	public void setFiller14(String filler14) {
		this.filler14 = filler14;
	}
	public String getFiller15() {
		return filler15;
	}
	public void setFiller15(String filler15) {
		this.filler15 = filler15;
	}
	public String getFiller16() {
		return filler16;
	}
	public void setFiller16(String filler16) {
		this.filler16 = filler16;
	}
	public String getFiller17() {
		return filler17;
	}
	public void setFiller17(String filler17) {
		this.filler17 = filler17;
	}
	public String getFiller18() {
		return filler18;
	}
	public void setFiller18(String filler18) {
		this.filler18 = filler18;
	}
	public String getFiller19() {
		return filler19;
	}
	public void setFiller19(String filler19) {
		this.filler19 = filler19;
	}
	public String getFiller20() {
		return filler20;
	}
	public void setFiller20(String filler20) {
		this.filler20 = filler20;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
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
		return "TotalSalary [year=" + year + ", month=" + month + ", monthStr=" + monthStr + ", employeeType="
				+ employeeType + ", basicSalary=" + basicSalary + ", overtimeAmount=" + overtimeAmount + ", allowance="
				+ allowance + ", totalSalary=" + totalSalary + ", loanDeduction=" + loanDeduction + ", netSalary="
				+ netSalary + ", salaryDate=" + salaryDate + ", departmentId=" + departmentId + ", filler1=" + filler1
				+ ", filler2=" + filler2 + ", filler3=" + filler3 + ", filler4=" + filler4 + ", filler5=" + filler5
				+ ", filler6=" + filler6 + ", filler7=" + filler7 + ", filler8=" + filler8 + ", filler9=" + filler9
				+ ", filler10=" + filler10 + ", filler11=" + filler11 + ", filler12=" + filler12 + ", filler13="
				+ filler13 + ", filler14=" + filler14 + ", filler15=" + filler15 + ", filler16=" + filler16
				+ ", filler17=" + filler17 + ", filler18=" + filler18 + ", filler19=" + filler19 + ", filler20="
				+ filler20 + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", createdBy="
				+ createdBy + ", createdIp=" + createdIp + ", updatedBy=" + updatedBy + ", updatedIp=" + updatedIp
				+ "]";
	}
	

}
