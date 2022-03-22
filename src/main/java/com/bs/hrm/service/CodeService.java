package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.Code;

public interface CodeService {
	public Code			addCode(Code code);
	
	public Code			updateCode(Code code);
	
	//public Code			getCode(Integer codeId);
	
	public List<Code>	getAllCode();
}
