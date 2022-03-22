package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bs.hrm.entity.TotalSalaryEntity;
import com.bs.hrm.entity.ids.TotalSalaryEntityId;

public interface TotalSalaryRepo extends JpaRepository<TotalSalaryEntity, TotalSalaryEntityId>{
	
	public List<TotalSalaryEntity>	findByYear(Integer 	year);
	
	public List<TotalSalaryEntity>	findByMonth(Integer month);
	
	public List<TotalSalaryEntity>	findByEmployeeType(String 	employeeType);
	
	public List<TotalSalaryEntity>	findByYearAndMonth(Integer 	year, Integer month);
	

	@Query("SELECT SUM(t.basicSalary), SUM(t.overtimeAmount), SUM(t.allowance),"
			+ " SUM(t.totalSalary), SUM(t.loanDeduction), SUM(t.netSalary) "
			+ "FROM TotalSalaryEntity t WHERE t.year=:year")
	public Double[][] findTotalByYear(Integer year);

	
	@Query("SELECT SUM(t.basicSalary), SUM(t.overtimeAmount), SUM(t.allowance),"
			+ " SUM(t.totalSalary), SUM(t.loanDeduction), SUM(t.netSalary) "
			+ "FROM TotalSalaryEntity t WHERE t.year=:year and t.month=:month")
	public Double[][] findTotalByYearAndMonth(Integer 	year, Integer month);
	
	@Query("SELECT SUM(t.basicSalary), SUM(t.overtimeAmount), SUM(t.allowance),"
			+ " SUM(t.totalSalary), SUM(t.loanDeduction), SUM(t.netSalary) "
			+ "FROM TotalSalaryEntity t WHERE t.employeeType=:employeeType")
	public Double[][] findTotalByEmployeeType(String employeeType);
	
	@Query("SELECT SUM(t.basicSalary), SUM(t.overtimeAmount), SUM(t.allowance),"
			+ " SUM(t.totalSalary), SUM(t.loanDeduction), SUM(t.netSalary) "
			+ "FROM TotalSalaryEntity t WHERE t.departmentId=:departmentId")
	public Double[][] findTotalByDepartment(Integer departmentId);
	
	@Query("SELECT SUM(t.basicSalary), SUM(t.overtimeAmount), SUM(t.allowance),"
			+ " SUM(t.totalSalary), SUM(t.loanDeduction), SUM(t.netSalary) "
			+ "FROM TotalSalaryEntity t")
	public Double[][] findTotalMonthlySalaray();

}
