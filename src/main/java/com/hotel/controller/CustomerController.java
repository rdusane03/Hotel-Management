package com.hotel.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.model.Customer;
import com.hotel.model.Login;
import com.hotel.repository.CustomerRepository;

import com.hotle.service.CustomerService;


@RestController

public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/savecustomer", method = RequestMethod.POST)
	public void registerCustomer(@RequestBody Customer customer) {
		customerService.save(customer);
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> list() {
	    return customerService.getAllCustomers();
	}
	
	@RequestMapping(value="/customers/{customer_id}", method= RequestMethod.GET)
	public ResponseEntity<Customer> get(@PathVariable Integer customer_id) {
	    try {
	    	Customer customer = customerService.get(customer_id);
	        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@RequestMapping(value="/customers/{customer_id}", method= RequestMethod.DELETE)
	public void delete(@PathVariable Integer customer_id) {
		customerService.delete(customer_id);
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseEntity<Customer> login(@RequestBody Login login){
		String email=login.getEmail();
		
		try {
			Customer customer= customerService.findByEmailIgnoreCase(email);
			if(customer.getPassword().equals(login.getPassword())){
				 return new ResponseEntity<Customer>(customer, HttpStatus.OK);
			}
		}catch(NoSuchElementException ex) {
			 return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}finally {
			
		}
		//return null;
		 return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
				
	}

}
