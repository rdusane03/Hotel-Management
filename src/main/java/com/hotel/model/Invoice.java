package com.hotel.model;

public class Invoice {
	
	private String invoice_id;
	private Order order;
	
	public Invoice(String invoice_id, Order order) {
		super();
		this.invoice_id = invoice_id;
		this.order = order;
	}

	public String getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(String invoice_id) {
		this.invoice_id = invoice_id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
}
