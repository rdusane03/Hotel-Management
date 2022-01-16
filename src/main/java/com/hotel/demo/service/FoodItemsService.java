package com.hotel.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.demo.model.Customer;
import com.hotel.demo.model.FoodItems;
import com.hotel.demo.repository.CustomerRepository;
import com.hotel.demo.repository.FoodItemsRepository;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
@Service
@Transactional
public class FoodItemsService {
	
	@Autowired
	private FoodItemsRepository foodItemsRepository;

	 @Autowired
	 MongoOperations mongoOperations;
	
	public List<FoodItems> getAllFoodItems() {
		// TODO Auto-generated method stub
		return foodItemsRepository.findAll();
	}

	public void saveItems(FoodItems foodItems) {
		// TODO Auto-generated method stub
		foodItemsRepository.save(foodItems);
	}

	public FoodItems getItem(Integer item_id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	public void deleteItems(Integer item_id) {
		// TODO Auto-generated method stub
		
		FoodItems foodItems = mongoOperations.findAndRemove(query(where("item_id").is(item_id)), FoodItems.class,"fooditems");
	//	foodItemsRepository.deleteByItemId(item_id);
	}


}
