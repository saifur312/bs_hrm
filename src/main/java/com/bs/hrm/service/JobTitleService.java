package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.JobTitle;

public interface JobTitleService {
	
	public JobTitle addJobTitle(JobTitle jobTitle);
	
	public JobTitle updateJobTitle(JobTitle jobTitle);
	
	public JobTitle getJobTitle(Integer jobId);
	
	public List<JobTitle> getAllJobTitle();

}
