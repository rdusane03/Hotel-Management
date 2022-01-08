package com.hotel.model;

public class Address {
	
	
	private String house_number;
	private String street_name;
	private String postal_code;
	private String city;
	
	
	public Address(String house_number, String street_name, String postal_code, String city) {
		super();
		this.house_number = house_number;
		this.street_name = street_name;
		this.postal_code = postal_code;
		this.city = city;
	}
	public String getHouse_number() {
		return house_number;
	}
	public void setHouse_number(String house_number) {
		this.house_number = house_number;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
