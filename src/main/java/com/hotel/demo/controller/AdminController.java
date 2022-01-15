package com.hotel.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.demo.model.Admin;
import com.hotel.demo.service.AdminService;



@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/saveadmin", method = RequestMethod.POST)
	public void registerAdmin(@RequestBody Admin admin) {
		//adminService.save(admin);
	}
	
	@GetMapping(value = "/save")
	public void getAdmin() {
	System.out.print("Hello");
	}

}
