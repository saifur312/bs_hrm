package com.bs.hrm.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.hrm.entity.Address;
import com.bs.hrm.repos.AddressRepo;
import com.bs.hrm.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired AddressRepo	addressRepo;
	
	@Override
	public Address addAddress(Address address) {
		
		Long autoIncAddresssId = 1L;
		Address lastAddress = addressRepo
										.findTopByEmployeeIdOrderByAddressIdDesc(address.getEmployeeId());
		//increment AddresssId manually
		if(lastAddress != null)
			autoIncAddresssId = lastAddress.getAddressId() + 1L;
		
		//set incremented Addresss Id into Addresss entity
		address.setAddressId(autoIncAddresssId);
		// set create date time 
		address.setCreatedDate(LocalDateTime.now()); 
		Address savedAddress = addressRepo.saveAndFlush(address);
		return savedAddress;
	}

	@Override
	public Address updateAddress(Address address) {
		return null;
	}

	@Override
	public List<Address> getAllAddressByEmployeeId(Long employeeId) {
		return null;
		/*
		 * List<Address> allAddress = addressRepo.findAll(); if(!allAddress.isEmpty()) {
		 * return allAddress; }else return Collections.emptyList();
		 */
	}

	@Override
	public Address getLastAddress(Long addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddress(Long employeeId, Long addressId) {
		// TODO Auto-generated method stub
		return null;
	}

}
