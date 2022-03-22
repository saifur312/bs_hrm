package com.bs.hrm.service.impl;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.CodeOld;
import com.bs.hrm.repos.CodeOldRepo;
import com.bs.hrm.service.CodeOldService;
@Service
public class CodeOldServiceImpl implements CodeOldService{
	
	@Autowired CodeOldRepo codeOldRepo; 
	
	@Override
	public CodeOld addCode(CodeOld codeOld) {
		//Increment 
		
		// set create date time 
		codeOld.setCreatedDate(LocalDateTime.now()); 
		CodeOld savedCode = codeOldRepo.saveAndFlush(codeOld);
		return savedCode;
	}

	@Override
	public CodeOld updateCode(CodeOld codeOld) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CodeOld getCode(Integer codeId) {
		CodeOld codeOld = codeOldRepo.findById(codeId).get();
		if(codeOld != null)
			return codeOld;
		else
			return null;
	}

	@Override
	public List<CodeOld> getAllCode() {
		List<CodeOld> allCode = codeOldRepo.findAll();
		if(!allCode.isEmpty()) {
			return allCode;
		}else
			return Collections.emptyList();
	}

}
