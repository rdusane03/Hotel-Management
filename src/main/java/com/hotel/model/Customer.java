package com.hotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	private Integer customer_id;
	private String name;
	private String email;
	private String password;
	private Address address;

	
	
	
	public Customer(Integer customer_id, String name, String email, Address address,String password) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.password = password;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	
}
