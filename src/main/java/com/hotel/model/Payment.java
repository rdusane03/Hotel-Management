package com.hotel.model;

public class Payment {
	
	private String payment_type;
	private String payment_amount;
	
	public Payment(String payment_type, String payment_amount) {
		super();
		this.payment_type = payment_type;
		this.payment_amount = payment_amount;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getPayment_amount() {
		return payment_amount;
	}

	public void setPayment_amount(String payment_amount) {
		this.payment_amount = payment_amount;
	}
}
