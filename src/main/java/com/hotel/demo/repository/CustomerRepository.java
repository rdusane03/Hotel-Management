package com.hotel.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotel.demo.model.Customer;



@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer>{
	
	 @Query(value="{email: ?0}")
		Customer findByEmailIgnoreCase(String email);

}
