package com.hotel.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.model.Customer;
import com.hotel.model.Order;
import com.hotel.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	private OrderService orderService;
	@RequestMapping(value = "/savecustomer", method = RequestMethod.POST)
	public void placeOrder(@RequestBody Order order) {
		orderService.save(order);
	}
	
	
}
