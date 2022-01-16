package com.hotel.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.demo.model.Customer;
import com.hotel.demo.model.Order;
import com.hotel.demo.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/place", method = RequestMethod.POST)
	public void placeOrder(@RequestBody Order order) {
		
		orderService.placeOrder(order);
		System.out.println("Order"+order.getAmount());	
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Order> list() {
		
	    return orderService.getListofOrders();
	}
	
	@RequestMapping(value="/{order_id}", method= RequestMethod.DELETE)
	public void delete(@PathVariable Integer order_id) {
		orderService.delete(order_id);
	
	
}
}