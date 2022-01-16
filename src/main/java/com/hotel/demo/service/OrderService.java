package com.hotel.demo.service;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.hotel.demo.model.Customer;
import com.hotel.demo.model.Order;
import com.hotel.demo.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private MongoOperations mongoOperations;
	
	@Autowired
	private OrderRepository orderRepository;

	
	public void placeOrder(Order order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
	}


	public List<Order> getListofOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}


	public void delete(Integer order_id) {
		// TODO Auto-generated method stub
		Order order = mongoOperations.findAndRemove(query(where("order_id").is(order_id)), Order.class,"order");

	}
	
	

}
