package com.bs.hrm.dto;

public enum BSMonth {

	JANUARY("Jan"),
	FEBRURAY("Feb"),
	MARCH("Mar"),
	APRIL("Apr"),
	MAY("May"),
	JUNE("Jun"),
	JULY("Jul"),
	AUGUST("Aug"),
	SEPTEMBER("Sep"),
	OCTOBER("Oct"),
	NOVEMBER("Nov"),
	DECEMBER("Dec");
	
	private final String shortForm;
	
	
	BSMonth(String shortForm){
		this.shortForm = shortForm;
	}
	
	public String getShortForm() {
		return shortForm;
	}
}
