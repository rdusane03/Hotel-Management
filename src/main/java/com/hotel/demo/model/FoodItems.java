package  com.hotel.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="fooditems")
public class FoodItems {

	
	private int item_id;
	private String name;
	private int quantity;
	private int price;
	private String description;
	public FoodItems(int item_id, String name, int quantity, int price, String description) {
		super();
		this.item_id = item_id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
	}
	public FoodItems() {
		super();
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
