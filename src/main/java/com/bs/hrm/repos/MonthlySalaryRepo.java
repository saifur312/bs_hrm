package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bs.hrm.entity.MonthlySalaryEntity;
import com.bs.hrm.entity.ids.MonthlySalaryEntityId;

public interface MonthlySalaryRepo extends JpaRepository<MonthlySalaryEntity, MonthlySalaryEntityId>{

	public List<MonthlySalaryEntity>	findByEmployeeId(Long 	employeeId);
	
	public List<MonthlySalaryEntity>	findByYear(Integer 	year);
	
	public List<MonthlySalaryEntity>	findByMonth(Integer month);
	
	public List<MonthlySalaryEntity>	findByEmployeeType(String 	employeeType);
	
	public List<MonthlySalaryEntity>	findByYearAndMonth(Integer 	year, Integer month);
	
	/*
	 * @Query("SELECT SUM(m.basicSalary), SUM(m.overtimeAmount), SUM(m.allowance), SUM(m.totalSalary)
	 *  FROM MonthlySalaryEntity m WHERE m.year=:year group by month"
	 * ) public List<Double[]> findTotalByYear(Integer year);
	 */
	
	
	@Query("SELECT m.month, SUM(m.basicSalary), SUM(m.overtimeAmount), SUM(m.allowance),"
			+ " SUM(m.totalSalary), SUM(m.loanDeduction), SUM(m.netSalary) "
			+ "FROM MonthlySalaryEntity m WHERE m.year=:year group by m.month")
	public Double[][] findTotalByYear(Integer year);

	
	@Query("SELECT SUM(m.basicSalary), SUM(m.overtimeAmount), SUM(m.allowance),"
			+ " SUM(m.totalSalary), SUM(m.loanDeduction), SUM(m.netSalary) "
			+ "FROM MonthlySalaryEntity m WHERE m.year=:year and m.month=:month")
	public Double[][] findTotalByYearAndMonth(Integer 	year, Integer month);
	
	@Query("SELECT SUM(m.basicSalary), SUM(m.overtimeAmount), SUM(m.allowance),"
			+ " SUM(m.totalSalary), SUM(m.loanDeduction), SUM(m.netSalary) "
			+ "FROM MonthlySalaryEntity m WHERE m.employeeType=:employeeType")
	public Double[][] findTotalByEmployeeType(String employeeType);
	
	@Query("SELECT m.month, SUM(m.basicSalary), SUM(m.overtimeAmount), SUM(m.allowance),"
			+ " SUM(m.totalSalary), SUM(m.loanDeduction), SUM(m.netSalary) "
			+ "FROM MonthlySalaryEntity m WHERE m.departmentId=:departmentId group by m.month")
	public String[][] findTotalByDepartment(Integer departmentId);
	
	@Query("SELECT m.month, SUM(m.basicSalary), SUM(m.overtimeAmount), SUM(m.allowance),"
			+ " SUM(m.totalSalary), SUM(m.loanDeduction), SUM(m.netSalary) "
			+ "FROM MonthlySalaryEntity m group by m.month")
	public Double[][] findTotalMonthlySalaray();
	 
	 
}
