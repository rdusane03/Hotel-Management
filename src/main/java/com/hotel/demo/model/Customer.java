package com.hotel.demo.model;

import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.hotel.demo.model.Order;

@Document(collection = "users")
public class Customer {
	
	
	private int customer_id;
	
	private String name;
	
	
	private String email;
	
	private String password;
	
	
	private String address;
	
	private String role;
	
    private List<Order> order;


	


	public Customer(int customer_id, String name, String email, String password, String address, String role,
			List<Order> order) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.role = role;
		this.order = order;
	}


	public Customer() {
		super();
	}


	public long getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<Order> getOrder() {
		return order;
	}


	public void setOrder(List<Order> order) {
		this.order = order;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	
}
