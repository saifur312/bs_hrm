package com.bs.hrm.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.Nominee;
import com.bs.hrm.entity.ids.NomineeIdentity;
import com.bs.hrm.repos.NomineeRepo;
import com.bs.hrm.service.NomineeService;
@Service
public class NomineeServiceImpl implements NomineeService{
	
	@Autowired NomineeRepo 		nomineeRepo;
	
	@Override
	public Nominee addNominee(Nominee nominee) {
		Long autoIncNomineeId = 1L;
		Nominee lastNominee = nomineeRepo.
				findTopByNomineeIdentityEmployeeIdOrderByNomineeIdentityNomineeIdDesc(
						nominee.getNomineeIdentity().getEmployeeId());
		//increment nomineeId manually
		if(lastNominee != null)
			autoIncNomineeId = lastNominee.getNomineeIdentity().getNomineeId() + 1L;
		//set incremented nominee Id into nominee entity
		nominee.setNomineeIdentity(new NomineeIdentity(autoIncNomineeId, nominee.getNomineeIdentity().getEmployeeId()));

		// parse date strings into LocalDate object and set to corresponding fields
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		if(!nominee.getDobStr().isEmpty() )
			nominee.setDob(LocalDate.parse(nominee.getDobStr(), formatter));
		
		// set create date time 
		nominee.setCreatedDate(LocalDateTime.now()); 
		Nominee storedNominee = nomineeRepo.saveAndFlush(nominee);
		
		return storedNominee;
	}

	@Override
	public Nominee getNominee(NomineeIdentity nomineeIdentity) {
		Nominee nominee = nomineeRepo.findById(nomineeIdentity).get();
		if(nominee != null)
			return nominee;
		else
			return null;
	}

	@Override
	public Nominee updateNominee(Nominee nominee) {
		Nominee updatedNominee = nomineeRepo.saveAndFlush(nominee);
		return updatedNominee;
	}

	@Override
	public List<Nominee> getAllNomineeByEmployeeId(Long employeeId) {
		List<Nominee> nomineesByEmployeeId = nomineeRepo.findByNomineeIdentityEmployeeId(employeeId);
		if(!nomineesByEmployeeId.isEmpty()) {
			return nomineesByEmployeeId;
		}else
			return Collections.emptyList();
	}

}
