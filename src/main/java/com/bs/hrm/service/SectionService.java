package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.Section;

public interface SectionService {
	
	public Section			addSection(Section section);
	
	public Section			updateSection(Section section);
	
	public Section			getSection(Integer sectionId);
	
	public List<Section>	getAllSection();
	
	public List<Section>	getAllSectionByDepartmentId(Integer departmentId);

}
