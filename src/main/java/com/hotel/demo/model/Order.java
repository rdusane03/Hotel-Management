package com.hotel.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
	
	
	private int order_id;

	
	private String amount;
	

	private String customer_email;

	

    private List<FoodItems> foodItems;



	public Order(int order_id, String amount, String customer_email, List<FoodItems> foodItems) {
		super();
		this.order_id = order_id;
		this.amount = amount;
		this.customer_email = customer_email;
		this.foodItems = foodItems;
	}



	public Order() {
		super();
	}



	public int getOrder_id() {
		return order_id;
	}



	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}



	public String getAmount() {
		return amount;
	}



	public void setAmount(String amount) {
		this.amount = amount;
	}



	public String getCustomer_email() {
		return customer_email;
	}



	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}



	public List<FoodItems> getFoodItems() {
		return foodItems;
	}



	public void setFoodItems(List<FoodItems> foodItems) {
		this.foodItems = foodItems;
	}



	
	

}
