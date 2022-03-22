package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bs.hrm.entity.Employee;
import com.bs.hrm.entity.Nominee;
import com.bs.hrm.entity.ids.NomineeIdentity;

@Repository
public interface NomineeRepo extends JpaRepository<Nominee, NomineeIdentity>{
	
	public List<Nominee>	findByNomineeIdentityEmployeeId(Long employeeId);
	
	public Nominee	findTopByNomineeIdentityEmployeeIdOrderByNomineeIdentityNomineeIdDesc(Long employeeId);
	
	List<Nominee> findAllByContactContains(String contact);
	
	List<Nominee> findAllByNIDContainsIgnoreCase(String NID);
	
	List<Nominee> findAllByFirstNameIsContainingIgnoreCase(String firstName);
	
	List<Nominee> findAllByLastNameContainingIgnoreCase(String lastName);
	
	List<Nominee> findAllByRelationContainsIgnoreCase(String relation);
	
	


}
