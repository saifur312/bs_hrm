package com.bs.hrm.service;

import java.util.List;

import com.bs.hrm.entity.Address;

public interface AddressService {
	
	public Address			addAddress(Address address);
	
	public Address			updateAddress(Address address);
	
	public Address			getLastAddress(Long addressId);
	
	public Address 			getAddress(Long employeeId, Long addressId);
		
	public List<Address>	getAllAddressByEmployeeId(Long employeeId);

}
