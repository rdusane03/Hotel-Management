package com.hotel.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.demo.model.Admin;
import com.hotel.demo.model.Customer;
import com.hotel.demo.model.Order;
import com.hotel.demo.service.CustomerService;
import com.hotel.demo.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

//	@Autowired
//	private CustomerService customerService;
//	
//	@Autowired
//	private OrderService orderService;
//	
//
//	@RequestMapping(value = "/saveadmin", method = RequestMethod.POST)
//	public void placeOrder(@RequestBody Order order) {
//		Customer customer=customerService.get(order.getOrder());
//		//adminService.save(admin);
//	}
	
	@PostMapping
	public void ooo(@RequestBody Order order) {
		System.out.println("Order"+order.getOrder_id());
		
	}
}
