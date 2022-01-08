package com.hotel.model;

public class Order {
	
	private String order_id;
	private Payment payment;
	private Customer customer;
	private FoodItems foodItems;
	
	public Order(String order_id, Payment payment, Customer customer, FoodItems foodItems) {
		super();
		this.order_id = order_id;
		this.payment = payment;
		this.customer = customer;
		this.foodItems = foodItems;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setUser(Customer customer) {
		this.customer = customer;
	}

	public FoodItems getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(FoodItems foodItems) {
		this.foodItems = foodItems;
	}
	
}
