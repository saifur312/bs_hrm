 /*******************************************************************************
 Author: Md. Saifur Rahman
 Created Date: 03-Jan-2021
 Last Update: 06-Jan-2021
 
 *******************************************************************************/

package com.bs.hrm.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.dto.EmployeeDto;
import com.bs.hrm.entity.Employee;
import com.bs.hrm.repos.EmployeeRepo;
import com.bs.hrm.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired	EmployeeRepo employeeRepo;
	
	public Period ageCalculator(LocalDate dob) {
		Period age = Period.between(dob, LocalDate.now());
		/*
		 * Period.between(dob, LocalDate.now()).getYears(); Period.between(dob,
		 * LocalDate.now()).getMonths(); Period.between(dob, LocalDate.now()).getDays();
		 */
		System.out.println("\n\nAge:\n\tY:\t" + age.getYears() + "\tM:\t"+ age.getMonths() +"\tD:\t"+ age.getDays());
		return age;
		
	}
	
	@Override
	public EmployeeDto addEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeDto, employee);
		
		// parse date strings into LocalDate object and set to corresponding fields
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		/*
		 * LocalDate appliacationDate =
		 * LocalDate.parse(employeeDto.getAppliacationDateStr(), formatter); LocalDate
		 * interviewDate = LocalDate.parse(employeeDto.getInterviewDateStr(),
		 * formatter); LocalDate joinDate =
		 * LocalDate.parse(employeeDto.getJoinDateStr(), formatter); LocalDate
		 * confirmDate = LocalDate.parse(employeeDto.getConfirmDateStr(), formatter);
		 * LocalDate finalSettleDate =
		 * LocalDate.parse(employeeDto.getFinalSettleDateStr(), formatter); LocalDate
		 * incrementDate = LocalDate.parse(employeeDto.getIncrementDateStr(),
		 * formatter); LocalDate promotionDate =
		 * LocalDate.parse(employeeDto.getPromotionDateStr(), formatter); LocalDate
		 * retiermentDate = LocalDate.parse(employeeDto.getRetiermentDateStr(),
		 * formatter); LocalDate pfJoinDate =
		 * LocalDate.parse(employeeDto.getPfJoinDateStr(), formatter); LocalDate dob =
		 * LocalDate.parse(employeeDto.getDobStr(), formatter);
		 */
	 	if(!employeeDto.getAppliacationDateStr().isEmpty() )
	 		employee.setAppliacationDate(LocalDate.parse(employeeDto.getAppliacationDateStr(), formatter));
	 	if(!employeeDto.getInterviewDateStr().isEmpty())
	 		employee.setInterviewDate(LocalDate.parse(employeeDto.getInterviewDateStr(), formatter));
	 	if(!employeeDto.getJoinDateStr().isEmpty())
	 		employee.setJoinDate(LocalDate.parse(employeeDto.getJoinDateStr(), formatter));
	 	if(!employeeDto.getConfirmDateStr().isEmpty())
	 		employee.setConfirmDate(LocalDate.parse(employeeDto.getConfirmDateStr(), formatter));
	 	if(!employeeDto.getFinalSettleDateStr().isEmpty())
	 		employee.setFinalSettleDate(LocalDate.parse(employeeDto.getFinalSettleDateStr(), formatter));
	 	if(!employeeDto.getIncrementDateStr().isEmpty())
	 		employee.setIncrementDate(LocalDate.parse(employeeDto.getIncrementDateStr(), formatter));
	 	if(!employeeDto.getPromotionDateStr().isEmpty())
	 		employee.setPromotionDate(LocalDate.parse(employeeDto.getPromotionDateStr(), formatter));
	 	if(!employeeDto.getRetiermentDateStr().isEmpty())
	 		employee.setRetiermentDate(LocalDate.parse(employeeDto.getRetiermentDateStr(), formatter));
	 	if(!employeeDto.getPfJoinDateStr().isEmpty())
	 		employee.setPfJoinDate(LocalDate.parse(employeeDto.getPfJoinDateStr(), formatter));
	 	if(!employeeDto.getDobStr().isEmpty())
	 		employee.setDob(LocalDate.parse(employeeDto.getDobStr(), formatter));
	 	
		// set create date time 
		employee.setCreatedDate(LocalDateTime.now()); 
		// saveAndFlush  used as a trail basis, otherwise use save()
		
		  Employee savedEmployee = employeeRepo.saveAndFlush(employee); EmployeeDto
		  savedEmployeeDto = new EmployeeDto(); BeanUtils.copyProperties(savedEmployee,
		  savedEmployeeDto); return savedEmployeeDto;
		 
			/*
			 * ageCalculator(LocalDate.parse(employeeDto.getDobStr(), formatter)); return
			 * null;
			 */
	}

	@Override
	public EmployeeDto getEmployee(long employeeId) {
		Employee employee = employeeRepo.getOne(employeeId);
		if(employee != null) {
			EmployeeDto employeeDto = new EmployeeDto();
			BeanUtils.copyProperties(employee, employeeDto);
			return employeeDto;
		}else
			return null;
	}

	@Override
	public EmployeeDto getEmployeeByName(String name) {
		Employee employee = employeeRepo.findByFullName(name);
		if(employee != null) {
			EmployeeDto employeeDto = new EmployeeDto();
			BeanUtils.copyProperties(employee, employeeDto);
			return employeeDto;
		}else
			return null;
	}

	@Override
	public EmployeeDto getEmployeeByNID(String nid) {
		Employee employee = employeeRepo.findByNID(nid);
		if(employee != null) {
			EmployeeDto employeeDto = new EmployeeDto();
			BeanUtils.copyProperties(employee, employeeDto);
			return employeeDto;
		}else
			return null;
	}

	@Override
	public EmployeeDto getEmployeeByFingerId(String fingerId) {
		Employee employee = employeeRepo.findByFingerId(fingerId);
		if(employee != null) {
			EmployeeDto employeeDto = new EmployeeDto();
			BeanUtils.copyProperties(employee, employeeDto);
			return employeeDto;
		}else
			return null;
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		List<Employee> employees = employeeRepo.findAll();
		List<EmployeeDto> allEmployeeDto = new ArrayList<EmployeeDto>();
		if(!employees.isEmpty()) {
			for(Employee employee : employees) {
				EmployeeDto employeeDto = new EmployeeDto();
				BeanUtils.copyProperties(employee, employeeDto);
				allEmployeeDto.add(employeeDto);
			}
			return allEmployeeDto;
		}else
			return Collections.emptyList();
	}

	@Override
	public List<EmployeeDto> getAllBydepartmentId(int departmentId) {
		List<Employee> employees = employeeRepo.findByDepartmentId(departmentId);
		List<EmployeeDto> allEmployeeOfOneDept = new ArrayList<EmployeeDto>();
		if(!employees.isEmpty()) {
			for(Employee employee : employees) {
				EmployeeDto employeeDto = new EmployeeDto();
				BeanUtils.copyProperties(employee, employeeDto);
				allEmployeeOfOneDept.add(employeeDto);
			}
			return allEmployeeOfOneDept;
		}else
			return Collections.emptyList();
	}

	@Override
	public List<EmployeeDto> getAllBySectionId(int sectionId) {
		List<Employee> employees = employeeRepo.findBySectionId(sectionId);
		List<EmployeeDto> allEmployeeOfOneSection = new ArrayList<EmployeeDto>();
		if(!employees.isEmpty()) {
			for(Employee employee : employees) {
				EmployeeDto employeeDto = new EmployeeDto();
				BeanUtils.copyProperties(employee, employeeDto);
				allEmployeeOfOneSection.add(employeeDto);
			}
			return allEmployeeOfOneSection;
		}else
			return Collections.emptyList();
	}

	@Override
	public List<EmployeeDto> getAllByCategoryId(int categoryId) {
		List<Employee> employees = employeeRepo.findByCategoryId(categoryId);
		List<EmployeeDto> allEmployeeOfOneCategory = new ArrayList<EmployeeDto>();
		if(!employees.isEmpty()) {
			for(Employee employee : employees) {
				EmployeeDto employeeDto = new EmployeeDto();
				BeanUtils.copyProperties(employee, employeeDto);
				allEmployeeOfOneCategory.add(employeeDto);
			}
			return allEmployeeOfOneCategory;
		}else
			return Collections.emptyList();
	}

	@Override
	public List<EmployeeDto> getAllByJobId(int jobId) {
		List<Employee> employees = employeeRepo.findByJobId(jobId);
		List<EmployeeDto> allEmployeeOfOneJob = new ArrayList<EmployeeDto>();
		if(!employees.isEmpty()) {
			for(Employee employee : employees) {
				EmployeeDto employeeDto = new EmployeeDto();
				BeanUtils.copyProperties(employee, employeeDto);
				allEmployeeOfOneJob.add(employeeDto);
			}
			return allEmployeeOfOneJob;
		}else
			return Collections.emptyList();
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
		Employee updatedEmployee = employeeRepo.getOne(employeeDto.getEmployeeId());
		EmployeeDto updatedEmployeeDto = new EmployeeDto();
		BeanUtils.copyProperties(updatedEmployee, updatedEmployeeDto);
		return updatedEmployeeDto;
	}

	@Override
	public EmployeeDto deleteEmployee(long employeeId) {
		Employee employee = employeeRepo.getOne(employeeId);
		return null;
	}

	@Override
	public List<EmployeeDto> getAllByEmployeeId(long employeeId) {
		List<Employee> employees = employeeRepo.findAllByEmployeeIdContains(employeeId);
		List<EmployeeDto> employeesDto = new ArrayList<EmployeeDto>();
		if(!employees.isEmpty()) {
			for(Employee employee : employees) {
				EmployeeDto employeeDto = new EmployeeDto();
				BeanUtils.copyProperties(employee, employeeDto);
				employeesDto.add(employeeDto);
			}
			return employeesDto;
		}else
			return Collections.emptyList();
	}

	@Override
	public List<EmployeeDto> getAllByNID(String NID) {
		List<Employee> employees = employeeRepo.findAllByNIDContainsIgnoreCase(NID);
		List<EmployeeDto> employeesDto = new ArrayList<EmployeeDto>();
		if(!employees.isEmpty()) {
			for(Employee employee : employees) {
				EmployeeDto employeeDto = new EmployeeDto();
				BeanUtils.copyProperties(employee, employeeDto);
				employeesDto.add(employeeDto);
			}
			return employeesDto;
		}else
			return Collections.emptyList();
	}

	@Override
	public List<EmployeeDto> getAllByName(String fullName) {
		List<Employee> employees = employeeRepo.findAllByFullNameIsContainingIgnoreCase(fullName);
		List<EmployeeDto> employeesDto = new ArrayList<EmployeeDto>();
		if(!employees.isEmpty()) {
			for(Employee employee : employees) {
				EmployeeDto employeeDto = new EmployeeDto();
				BeanUtils.copyProperties(employee, employeeDto);
				employeesDto.add(employeeDto);
			}
			return employeesDto;
		}else
			return Collections.emptyList();
	}

	@Override
	public List<EmployeeDto> getAllByNickName(String nickName) {
		List<Employee> employees = employeeRepo.findAllByNickNameContainsIgnoreCase(nickName);
		List<EmployeeDto> employeesDto = new ArrayList<EmployeeDto>();
		if(!employees.isEmpty()) {
			for(Employee employee : employees) {
				EmployeeDto employeeDto = new EmployeeDto();
				BeanUtils.copyProperties(employee, employeeDto);
				employeesDto.add(employeeDto);
			}
			return employeesDto;
		}else
			return Collections.emptyList();
	}

	@Override
	public List<EmployeeDto> getAllByFingerId(String fingerId) {
		List<Employee> employees = employeeRepo.findAllByFingerIdContainingIgnoreCase(fingerId);
		List<EmployeeDto> employeesDto = new ArrayList<EmployeeDto>();
		if(!employees.isEmpty()) {
			for(Employee employee : employees) {
				EmployeeDto employeeDto = new EmployeeDto();
				BeanUtils.copyProperties(employee, employeeDto);
				employeesDto.add(employeeDto);
			}
			return employeesDto;
		}else
			return Collections.emptyList();
	}

}
