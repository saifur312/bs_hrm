package com.bs.hrm.service.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.dto.MonthlySalary;
import com.bs.hrm.dto.TotalSalary;
import com.bs.hrm.dto.TotalSalary;
import com.bs.hrm.entity.TotalSalaryEntity;
import com.bs.hrm.repos.TotalSalaryRepo;
import com.bs.hrm.service.TotalSalaryService;

@Service
public class TotalSalaryServiceImpl implements TotalSalaryService{

	@Autowired TotalSalaryRepo totalSalaryRepo;
	
	@Override
	public TotalSalary saveTotalSalary(TotalSalary totalSalary) {
		 
		TotalSalaryEntity tsEntity = new TotalSalaryEntity();
		BeanUtils.copyProperties(totalSalary, tsEntity);
		// set create date time 
		tsEntity.setCreatedDate(LocalDateTime.now()); 
		TotalSalaryEntity savedTSEntity = totalSalaryRepo.saveAndFlush(tsEntity);
		TotalSalary savedTS = new TotalSalary();
		BeanUtils.copyProperties(savedTSEntity, savedTS);
		
		return savedTS;
	}

	@Override
	public TotalSalary updateTotalSalary(TotalSalary totalSalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TotalSalary getTotalSalary(Integer year, Integer month, String employeeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TotalSalary> getAllTotalSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TotalSalary> getTotalSalaryByYear(Integer year) {
		Double[][] query2D = totalSalaryRepo.findTotalByYear(year);
		List<TotalSalary> totalSalaryList = new ArrayList<TotalSalary>();
		if (query2D != null && query2D.length > 0 && query2D[0].length > 0) {
			for(Double[] row : query2D) {
				TotalSalary totalSalary = new TotalSalary();
				
				System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3] + "\t" + row[4] + "\t" + row[5]);
				
				totalSalary.setYear(year);
				totalSalary.setBasicSalary(BigDecimal.valueOf(row[0]));
				totalSalary.setOvertimeAmount(BigDecimal.valueOf(row[1]));
				totalSalary.setAllowance(BigDecimal.valueOf(row[2]));
				totalSalary.setTotalSalary(BigDecimal.valueOf(row[3]));
				totalSalary.setLoanDeduction(BigDecimal.valueOf(row[4]));
				totalSalary.setNetSalary(BigDecimal.valueOf(row[5]));
				totalSalaryList.add(totalSalary);
			}
		}
		return totalSalaryList;
	}

	@Override
	public List<TotalSalary> getTotalSalaryByYearAndMonth(Integer year, Integer month) {
		Double[][] query2D = totalSalaryRepo.findTotalByYearAndMonth(year, month);
		List<TotalSalary> totalSalaryList = new ArrayList<TotalSalary>();
		if (query2D != null && query2D.length > 0 && query2D[0].length > 0) {
			for(Double[] row : query2D) {
				TotalSalary totalSalary = new TotalSalary();
				
				totalSalary.setYear(year);
				totalSalary.setMonth(month);
				totalSalary.setBasicSalary(BigDecimal.valueOf(row[0]));
				totalSalary.setOvertimeAmount(BigDecimal.valueOf(row[1]));
				totalSalary.setAllowance(BigDecimal.valueOf(row[2]));
				totalSalary.setTotalSalary(BigDecimal.valueOf(row[3]));
				totalSalary.setLoanDeduction(BigDecimal.valueOf(row[4]));
				totalSalary.setNetSalary(BigDecimal.valueOf(row[5]));

				String monthStr = "";

				switch (month) {
				case 1:
					monthStr = "Jan";
					break;
				case 2:
					monthStr = "Feb";
					break;
				case 3:
					monthStr = "Mar";
					break;
				case 4:
					monthStr = "Apr";
					break;
				case 5:
					monthStr = "May";
					break;
				case 6:
					monthStr = "Jun";
					break;
				default:
					break;
				}
				totalSalary.setMonthStr(monthStr);
				totalSalaryList.add(totalSalary);
			}
		}
		return totalSalaryList;
	}

	@Override
	public List<TotalSalary> getTotalSalaryByEmployeeType(String employeeType) {
		Double[][] query2D = totalSalaryRepo.findTotalByEmployeeType(employeeType);
		List<TotalSalary> totalSalaryList = new ArrayList<TotalSalary>();
		if (query2D != null && query2D.length > 0 && query2D[0].length > 0) {
			for(Double[] row : query2D) {
				TotalSalary totalSalary = new TotalSalary();
				
				totalSalary.setEmployeeType(employeeType);
				totalSalary.setBasicSalary(BigDecimal.valueOf(row[0]));
				totalSalary.setOvertimeAmount(BigDecimal.valueOf(row[1]));
				totalSalary.setAllowance(BigDecimal.valueOf(row[2]));
				totalSalary.setTotalSalary(BigDecimal.valueOf(row[3]));
				totalSalary.setLoanDeduction(BigDecimal.valueOf(row[4]));
				totalSalary.setNetSalary(BigDecimal.valueOf(row[5]));
				totalSalaryList.add(totalSalary);
			}
		}
		return totalSalaryList;
	}

	@Override
	public List<MonthlySalary> getTotalSalaryByDepartment(Integer departmentId){
		Double[][] query2D = totalSalaryRepo.findTotalByDepartment(departmentId);
		List<MonthlySalary> monthlySalaryList = new ArrayList<MonthlySalary>();
		if (query2D != null && query2D.length > 0 && query2D[0].length > 0) {
			for(Double[] row : query2D) {
				MonthlySalary monthlySalary = new MonthlySalary();
				
				monthlySalary.setBasicSalary(BigDecimal.valueOf(row[0]));
				monthlySalary.setOvertimeAmount(BigDecimal.valueOf(row[1]));
				monthlySalary.setAllowance(BigDecimal.valueOf(row[2]));
				monthlySalary.setTotalSalary(BigDecimal.valueOf(row[3]));
				monthlySalary.setLoanDeduction(BigDecimal.valueOf(row[4]));
				monthlySalary.setNetSalary(BigDecimal.valueOf(row[5]));
				monthlySalaryList.add(monthlySalary);
			}
		}
		return monthlySalaryList;
	}
}
