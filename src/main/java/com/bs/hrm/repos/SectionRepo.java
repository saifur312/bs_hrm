package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bs.hrm.entity.Section;

@Repository
public interface SectionRepo extends JpaRepository<Section, Integer>{
	
	List<Section> findAllByDepartmentId(Integer departmentId);

}
