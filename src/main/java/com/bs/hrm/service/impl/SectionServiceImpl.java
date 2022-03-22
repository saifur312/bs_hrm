package com.bs.hrm.service.impl;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.Department;
import com.bs.hrm.entity.Section;
import com.bs.hrm.repos.SectionRepo;
import com.bs.hrm.service.DepartmentService;
import com.bs.hrm.service.SectionService;

@Service
public class SectionServiceImpl implements SectionService {

	@Autowired SectionRepo sectionRepo; 
	@Autowired DepartmentService departmentService; 
	
	@Override
	public Section addSection(Section section) {
		// set create date time 
		section.setCreatedDate(LocalDateTime.now()); 
		Section savedSection = sectionRepo.saveAndFlush(section);
		return savedSection;
	}

	@Override
	public Section updateSection(Section section) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Section getSection(Integer sectionId) {
		Section section = sectionRepo.findById(sectionId).get();
		if(section != null)
			return section;
		else
			return null;
	}

	@Override
	public List<Section> getAllSection() {
		List<Section> allSection = sectionRepo.findAll();
		
		if(!allSection.isEmpty()) {
			for(Section s : allSection) {
				if(s.getDepartmentId() != null) {
					Department dept = departmentService.getDepartment(s.getDepartmentId());
					s.setDepartmentName(dept.getDepartmentName());
				}
			}
			return allSection;
		}else
			return Collections.emptyList();
	}

	@Override
	public List<Section> getAllSectionByDepartmentId(Integer departmentId) {
		List<Section> allSection = sectionRepo.findAllByDepartmentId(departmentId);
		int index = 0;
		if(!allSection.isEmpty()) {
			for(Section s : allSection) {
				Department dept = departmentService.getDepartment(s.getDepartmentId());
				System.out.println(s);
				allSection.set(index, s);
				index++;
			}
			return allSection;
		}else
			return Collections.emptyList();
	}
	
	

}
