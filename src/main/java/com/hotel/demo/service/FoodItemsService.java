package com.hotel.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.demo.model.Customer;
import com.hotel.demo.model.FoodItems;
import com.hotel.demo.repository.FoodItemsRepository;

@Service
@Transactional
public class FoodItemsService {
	
	@Autowired
	private FoodItemsRepository foodItemsRepository;

	

	public List<FoodItems> getAllFoodItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(FoodItems foodItems) {
		// TODO Auto-generated method stub
		
	}

	public FoodItems getItem(Integer item_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteItem(Integer customer_id) {
		// TODO Auto-generated method stub
		
	}

	

}
