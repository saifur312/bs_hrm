 /*******************************************************************************
 Author: Md. Saifur Rahman
 Created Date: 03-Jan-2021
 Last Update: 06-Jan-2021
 
 *******************************************************************************/

package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.dto.EmployeeDto;

public interface EmployeeService {
	
	public EmployeeDto addEmployee(EmployeeDto employeeDto);
	
	public EmployeeDto getEmployee(long employeeId);
	
	public EmployeeDto getEmployeeByName(String name);
	
	public EmployeeDto getEmployeeByNID(String nid);
	
	public EmployeeDto getEmployeeByFingerId(String fingerId);
	
	public List<EmployeeDto> getAllEmployee();
	
	public List<EmployeeDto> getAllBydepartmentId(int departmentId);
	
	public List<EmployeeDto> getAllBySectionId(int sectionId);
	
	public List<EmployeeDto> getAllByCategoryId(int categoryId);
	
	public List<EmployeeDto> getAllByJobId(int jobId);
	
	public EmployeeDto updateEmployee(EmployeeDto employeeDto);
	
	public EmployeeDto deleteEmployee(long employeeId);
	
	public List<EmployeeDto> getAllByEmployeeId(long employeeId);
	
	public List<EmployeeDto> getAllByNID(String NID);
	
	public List<EmployeeDto> getAllByName(String fullName);
	
	public List<EmployeeDto> getAllByNickName(String nickName);
	
	public List<EmployeeDto> getAllByFingerId(String fingerId);

}
