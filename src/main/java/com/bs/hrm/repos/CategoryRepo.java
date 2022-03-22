package com.bs.hrm.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bs.hrm.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
