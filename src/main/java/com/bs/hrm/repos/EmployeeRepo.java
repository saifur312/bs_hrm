 /*******************************************************************************
 Author: Md. Saifur Rahman
 Created Date: 03-Jan-2021
 Last Update: 06-Jan-2021
 
 *******************************************************************************/

package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bs.hrm.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	
	Employee findById(long employeeId);
	
	Employee findByNID(String NID);
	
	Employee findByFullName(String fullName);
	
	Employee findByFingerId(String fingerId);
	
	List<Employee> findByDepartmentId(int departmentId);
	
	List<Employee> findBySectionId(int sectionId);
	
	List<Employee> findByJobId(int jobId);
	
	List<Employee> findByCategoryId(int categoryId);
	
	List<Employee> findAllByEmployeeIdContains(long employeeId);
	
	List<Employee> findAllByNIDContainsIgnoreCase(String NID);
	
	List<Employee> findAllByFullNameIsContainingIgnoreCase(String fullName);
	
	List<Employee> findAllByFingerIdContainingIgnoreCase(String FingerId);
	
	List<Employee> findAllByNickNameContainsIgnoreCase(String nickName);

}
