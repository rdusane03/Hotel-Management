package com.hotel.demo.service;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.hotel.demo.model.Customer;
import com.hotel.demo.model.FoodItems;
import com.hotel.demo.repository.CustomerRepository;

@Service
public class CustomerService {

	
//	@Autowired
//	public Customer save(Customer customer) {
//		// TODO Auto-generated method stub
//		
//	}

	 @Autowired
	 MongoOperations mongoOperations;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void save(Customer customer) {
    	customerRepository.save(customer);
  
    }
	
	public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

	public void delete(Integer customer_id) {
		// TODO Auto-generated method stub
		Customer customer = mongoOperations.findAndRemove(query(where("item_id").is(customer_id)), Customer.class,"fooditems");
	}

	public Customer getByEmailId(String email) {
		// TODO Auto-generated method stub
		return customerRepository.findByEmailIgnoreCase(email);
	}

	
	
}
