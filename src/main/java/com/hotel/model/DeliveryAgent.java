package com.hotel.model;

public class DeliveryAgent {
	

	private String agent_id;
	private String agent_name;
	private String agent_email;
	private String phone;
	
	public DeliveryAgent(String agent_id, String agent_name, String agent_email, String phone) {
		super();
		this.agent_id = agent_id;
		this.agent_name = agent_name;
		this.agent_email = agent_email;
		this.phone = phone;
	}

	public String getAgent_id() {
		return agent_id;
	}

	public void setAgent_id(String agent_id) {
		this.agent_id = agent_id;
	}

	public String getAgent_name() {
		return agent_name;
	}

	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}

	public String getAgent_email() {
		return agent_email;
	}

	public void setAgent_email(String agent_email) {
		this.agent_email = agent_email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
