package com.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.model.Order;
import com.hotel.repository.OrderRepository;


@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	public void save(Order order) {
		orderRepository.save(order);
	}

}
