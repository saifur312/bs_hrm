package com.bs.hrm.entity.ids;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class MonthlySalaryEntityId implements Serializable{

	
	private static final long serialVersionUID = 4437367506298437639L;
	
	private Long employeeId;
	private Integer	year;
	private Integer month;
	private String employeeType;

}
