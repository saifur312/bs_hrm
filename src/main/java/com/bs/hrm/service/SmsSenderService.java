package com.bs.hrm.service;

public interface SmsSenderService {
	
	public void sendSMS(String receiver, Long employeeId);

}
