package com.bs.hrm.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bs.hrm.entity.Address;
import com.bs.hrm.entity.ids.AddressId;

@Repository
public interface AddressRepo extends JpaRepository<Address, AddressId>{
	
	public List<Address>	findByEmployeeId(Long 	employeeId);

	public Address	findTopByEmployeeIdOrderByAddressIdDesc(Long employeeId);

}
