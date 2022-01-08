package com.hotel.model;


public class FoodItems {

	private String item_id;
	private String item_name;
	private String quantity;
	private String item_price;
	private String description;
	
	public FoodItems(String item_id, String item_name, String quantity, String item_price, String description) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.quantity = quantity;
		this.item_price = item_price;
		this.description = description;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getItem_price() {
		return item_price;
	}
	public void setItem_price(String item_price) {
		this.item_price = item_price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
