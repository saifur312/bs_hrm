package com.bs.hrm.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bs.hrm.entity.Code;
import com.bs.hrm.entity.ids.CodeId;

public interface CodeRepo extends JpaRepository<Code, CodeId>{

}
