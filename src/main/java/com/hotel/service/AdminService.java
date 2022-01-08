package com.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.model.Admin;
import com.hotel.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	public void save(Admin admin) {
		adminRepository.save(admin);
	}
	
	
}
