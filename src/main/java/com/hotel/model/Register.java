package com.hotel.model;

public class Register {
	
	
	private String user_id;
	private String name;
	private String email;
	private Address address;
	private String password;
	private String phone;
	
	public Register(String user_id, String name, String email, Address address, String password, String phone) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.password = password;
		this.phone = phone;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
