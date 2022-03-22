package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.CodeOld;

public interface CodeOldService {
	public CodeOld			addCode(CodeOld codeOld);
	
	public CodeOld			updateCode(CodeOld codeOld);
	
	public CodeOld			getCode(Integer codeId);
	
	public List<CodeOld>	getAllCode();
}
