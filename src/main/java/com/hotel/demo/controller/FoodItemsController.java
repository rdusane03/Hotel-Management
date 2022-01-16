package com.hotel.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.demo.model.FoodItems;
import com.hotel.demo.service.FoodItemsService;

@RestController
@RequestMapping("/fooditems")
public class FoodItemsController {

	@Autowired
	private FoodItemsService foodItemsService;
	
	@PostMapping(value = "/save")
	public void addFoodItems(@RequestBody FoodItems foodItems) {
	//	System.out.println("Hellooo"+customer.getAddress().toString());
		foodItemsService.saveItems(foodItems);
	}
	
	@GetMapping
	public List<FoodItems> getFoodItemslist() {
	    return foodItemsService.getAllFoodItems();
	}
	
	@RequestMapping(value="/{customer_id}", method= RequestMethod.GET)
	public ResponseEntity<FoodItems> get(@PathVariable Integer item_id) {
	    try {
	    	FoodItems foodItems = foodItemsService.getItem(item_id);
	        return new ResponseEntity<FoodItems>(foodItems, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<FoodItems>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@RequestMapping(value="/{item_id}", method= RequestMethod.DELETE)
	public void deleteFoodItems(@PathVariable("item_id") Integer item_id) {
		foodItemsService.deleteItem(item_id);
	}
	
	
	
	
}
