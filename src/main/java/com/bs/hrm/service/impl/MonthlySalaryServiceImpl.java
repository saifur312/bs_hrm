package com.bs.hrm.service.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.dto.MonthlySalary;
import com.bs.hrm.entity.MonthlySalaryEntity;
import com.bs.hrm.repos.MonthlySalaryRepo;
import com.bs.hrm.service.MonthlySalaryService;

@Service
public class MonthlySalaryServiceImpl implements MonthlySalaryService{

	@Autowired MonthlySalaryRepo monthlySalaryRepo;
	
	@Override
	public MonthlySalary saveMonthlySalary(MonthlySalary monthlySalary) {
		 
		MonthlySalaryEntity msEntity = new MonthlySalaryEntity();
		BeanUtils.copyProperties(monthlySalary, msEntity);
		// set create date time 
		msEntity.setCreatedDate(LocalDateTime.now()); 
		MonthlySalaryEntity savedMSEntity = monthlySalaryRepo.saveAndFlush(msEntity);
		MonthlySalary savedMS = new MonthlySalary();
		BeanUtils.copyProperties(savedMSEntity, savedMS);
		
		return savedMS;
	}

	//will discuss later on
	@Override
	public MonthlySalary updateMonthlySalary(MonthlySalary monthlySalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MonthlySalary getMonthlySalary(Long employeeId, Integer year, Integer month, String employeeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MonthlySalary> getAllMonthlySalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MonthlySalary> getMonthlySalaryByEmployeeId(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MonthlySalary> getMonthlySalaryByYear(Integer year) {
		Double[][] query2D = monthlySalaryRepo.findTotalByYear(year);
		List<MonthlySalary> monthlySalaryList = new ArrayList<MonthlySalary>();
		if (query2D != null && query2D.length > 0 && query2D[0].length > 0) { 
			for(Double[] row : query2D) {
				MonthlySalary monthlySalary = new MonthlySalary();
				
				Integer month = row[0].intValue();
				monthlySalary.setMonthStr(convertMonthIntegerToString(month));
				monthlySalary.setYear(year);
				
				monthlySalary.setBasicSalary(BigDecimal.valueOf(row[1]));
				monthlySalary.setOvertimeAmount(BigDecimal.valueOf(row[2]));
				monthlySalary.setAllowance(BigDecimal.valueOf(row[3]));
				monthlySalary.setTotalSalary(BigDecimal.valueOf(row[4]));
				monthlySalary.setLoanDeduction(BigDecimal.valueOf(row[5]));
				monthlySalary.setNetSalary(BigDecimal.valueOf(row[6]));
				
				/*
				 * BigDecimal basicSalaray = BigDecimal.valueOf(row[0]); BigDecimal overtime =
				 * BigDecimal.valueOf(row[1]); for(Double col : row) { }
				 */

				monthlySalaryList.add(monthlySalary);
			}
		}
		
		/*
		 * List<MonthlySalaryEntity> monthlySalaryEntityList =
		 * monthlySalaryRepo.findByYear(year); for(MonthlySalaryEntity
		 * monthlySalaryEntity : monthlySalaryEntityList) { MonthlySalary monthlySalary
		 * = new MonthlySalary(); BeanUtils.copyProperties(monthlySalaryEntity,
		 * monthlySalary); monthlySalaryList.add(monthlySalary); }
		 */

		//System.out.println( "Service "+ monthlySalaryList);
		return monthlySalaryList;
	}

	@Override
	public List<MonthlySalary> getMonthlySalaryByYearAndMonth(Integer year, Integer month) {
		Double[][] query2D = monthlySalaryRepo.findTotalByYearAndMonth(year, month);
		List<MonthlySalary> monthlySalaryList = new ArrayList<MonthlySalary>();
		if (query2D != null && query2D.length > 0 && query2D[0].length > 0) { 
			for(Double[] row : query2D) {
				MonthlySalary monthlySalary = new MonthlySalary();
				
				monthlySalary.setYear(year);
				monthlySalary.setMonth(month);
				monthlySalary.setBasicSalary(BigDecimal.valueOf(row[0]));
				monthlySalary.setOvertimeAmount(BigDecimal.valueOf(row[1]));
				monthlySalary.setAllowance(BigDecimal.valueOf(row[2]));
				monthlySalary.setTotalSalary(BigDecimal.valueOf(row[3]));
				monthlySalary.setLoanDeduction(BigDecimal.valueOf(row[4]));
				monthlySalary.setNetSalary(BigDecimal.valueOf(row[5]));
				
				String monthStr = convertMonthIntegerToString(month);
				monthlySalary.setMonthStr(monthStr);
				monthlySalaryList.add(monthlySalary);
			}
		}
		return monthlySalaryList;
	}

	@Override
	public List<MonthlySalary> getMonthlySalaryByEmployeeType(String employeeType) {
		Double[][] query2D = monthlySalaryRepo.findTotalByEmployeeType(employeeType);
		List<MonthlySalary> monthlySalaryList = new ArrayList<MonthlySalary>();
		if (query2D != null && query2D.length > 0 && query2D[0].length > 0) {
			for(Double[] row : query2D) {
				MonthlySalary monthlySalary = new MonthlySalary();
				
				monthlySalary.setEmployeeType(employeeType);
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

	@Override
	public List<MonthlySalary> getMonthlySalaryByDepartment(Integer departmentId){
		String[][] query2D = monthlySalaryRepo.findTotalByDepartment(departmentId);
		List<MonthlySalary> monthlySalaryList = new ArrayList<MonthlySalary>();
		if (query2D != null && query2D.length > 0 && query2D[0].length > 0) {
			for(int i=0; i < query2D.length; i++) {
				//for(int j=0; j< query2D[i].length; j++ ) {
					MonthlySalary monthlySalary = new MonthlySalary();
					Integer month = Integer.parseInt(query2D[i][0]);
					monthlySalary.setMonthStr(convertMonthIntegerToString(month));
					monthlySalary.setBasicSalary(new BigDecimal(query2D[i][1]).setScale(2, BigDecimal.ROUND_HALF_UP));
					monthlySalary.setOvertimeAmount(new BigDecimal(query2D[i][2]).setScale(2, BigDecimal.ROUND_HALF_UP));
					monthlySalary.setAllowance(new BigDecimal(query2D[i][3]).setScale(2, BigDecimal.ROUND_HALF_UP));
					monthlySalary.setTotalSalary(new BigDecimal(query2D[i][4]).setScale(2, BigDecimal.ROUND_HALF_UP));
					monthlySalary.setLoanDeduction(new BigDecimal(query2D[i][5]).setScale(2, BigDecimal.ROUND_HALF_UP));
					monthlySalary.setNetSalary(new BigDecimal(query2D[i][6]).setScale(2, BigDecimal.ROUND_HALF_UP));

					monthlySalaryList.add(monthlySalary);
				//}
			}
			/*
			 * for(String[] row : query2D) { }
			 */
		}
		//System.err.println(monthlySalaryList);
		return monthlySalaryList;
	}
	
	public String convertMonthIntegerToString(Integer month) {
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
		case 7:
			monthStr = "Jul";
			break;
		case 8:
			monthStr = "Aug";
			break;
		case 9:
			monthStr = "Sep";
			break;
		case 10:
			monthStr = "Oct";
			break;
		case 11:
			monthStr = "Nov";
			break;
		case 12:
			monthStr = "Dec";
			break;
		default:
			break;
		}
		return monthStr;
	}

}
