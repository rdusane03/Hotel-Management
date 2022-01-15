package com.hotel.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.demo.model.Customer;
import com.hotel.demo.model.Login;
import com.hotel.demo.repository.CustomerRepository;
import com.hotel.demo.service.CustomerService;



@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	//@CrossOrigin(origins = "http://localhost:3000")
	//@CrossOrigin
	@PostMapping(value = "/savecustomer")
	public void registerCustomer(@RequestBody Customer customer) {
		System.out.println("Hellooo"+customer.getAddress().toString());
		customerService.save(customer);
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
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
