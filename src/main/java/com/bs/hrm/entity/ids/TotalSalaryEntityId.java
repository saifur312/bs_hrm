package com.bs.hrm.entity.ids;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TotalSalaryEntityId implements Serializable{


	private static final long serialVersionUID = 7662002353563853544L;
	
	private Integer	year;
	private Integer month;
	private String employeeType;

}
