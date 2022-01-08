package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.model.Admin;
import com.hotel.model.Customer;
import com.hotel.service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/saveadmin", method = RequestMethod.POST)
	public void registerAdmin(@RequestBody Admin admin) {
		adminService.save(admin);
	}

}
