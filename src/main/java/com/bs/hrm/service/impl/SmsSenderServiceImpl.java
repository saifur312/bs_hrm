package com.bs.hrm.service.impl;

import org.springframework.stereotype.Service;

import com.bs.hrm.service.SmsSenderService;
//Installing the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
@Service
public class SmsSenderServiceImpl implements SmsSenderService{
	 // Find your Account Sid and Auth Token at twilio.com/console
	 public static final String ACCOUNT_SID =
	         "AC18af237fe0f64da1a4da35a2af8e7be6";
	 public static final String AUTH_TOKEN =
	         "ed0b483ac722a4009b20f176f430de45";

		/*
		 * public static void main(String[] args) { Twilio.init(ACCOUNT_SID,
		 * AUTH_TOKEN);
		 * 
		 * Message message = Message .creator(new PhoneNumber("+14159352345"), // to new
		 * PhoneNumber("+14158141829"), // from "Where's Wallace?") .create();
		 * 
		 * System.out.println(message.getSid()); }
		 */

	@Override
	public void sendSMS(String receiver, Long employeeId) {
	    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	    
	    Message message = Message
	    		.creator(new PhoneNumber(receiver), // E.164 formatting, [+][country code][phone number including area code]
	    				new PhoneNumber("+15302854036"), 
	    				"Your employee Id is created which is " + employeeId )
	    		.create();
	    System.out.println("SMS sent successfull\tSMS ID:  " + message.getSid()); 
	}
}

