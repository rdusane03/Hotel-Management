package com.hotel.demo.controller;

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

import com.hotel.demo.model.Customer;
import com.hotel.demo.model.Login;
import com.hotel.demo.repository.CustomerRepository;
import com.hotel.demo.service.CustomerService;
import com.hotel.demo.service.SequenceGeneratorService;


@RestController
public class CustomerController {
	
	
	
	@Autowired
	private CustomerService customerService;
	
	
	private SequenceGeneratorService sequenceGenerator;
	
	@RequestMapping(value = "/savecustomer", method = RequestMethod.POST)
	public ResponseEntity<String> registerUser(@RequestBody Customer customer) {
		
		System.out.println("dafsf"+customer.getEmail());
		Customer customer1= customerService.getByEmailId(customer.getEmail());
		
		if(customer1== null)
		{
			customerService.save(customer);
			return new ResponseEntity<String>("User Saved", HttpStatus.OK);
		}else {
			 return new ResponseEntity<String>(customer.getEmail(), HttpStatus.IM_USED);
		}
		
	}
			
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public List<Customer> list() {
	    return customerService.getAllCustomers();
	}
	

	
	@RequestMapping(value="/{customer_id}", method= RequestMethod.DELETE)
	public void delete(@PathVariable Integer customer_id) {
		customerService.delete(customer_id);
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseEntity<Customer> login(@RequestBody Login login){
		String email=login.getEmail();
		
		try {
			Customer customer= customerService.getByEmailId(email);
			if(customer!= null) {
				if(customer.getPassword().equals(login.getPassword())){
					 return new ResponseEntity<Customer>(customer, HttpStatus.OK);
				}
			}
			
		}catch(NoSuchElementException ex) {
		
			 return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}finally {
			
		}	//return null;
		 return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);		
	}
}
