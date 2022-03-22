package com.bs.hrm.service.impl;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.Code;
import com.bs.hrm.repos.CodeRepo;
import com.bs.hrm.service.CodeService;
@Service
public class CodeServiceImpl implements CodeService{
	
	@Autowired CodeRepo codeRepo; 
	
	@Override
	public Code addCode(Code code) {
		//Increment 
		if(codeRepo.findAll().size() == 0)
			
		// set create date time 
		code.setCreatedDate(LocalDateTime.now()); 
		Code savedCode = codeRepo.saveAndFlush(code);
		return savedCode;
	}

	@Override
	public Code updateCode(Code code) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public Code getCode(Integer codeId) { Code code =
	 * codeRepo.findById(codeId).get(); if(code != null) return code; else
	 * return null; }
	 */

	@Override
	public List<Code> getAllCode() {
		List<Code> allCode = codeRepo.findAll();
		if(!allCode.isEmpty()) {
			return allCode;
		}else
			return Collections.emptyList();
	}

}
