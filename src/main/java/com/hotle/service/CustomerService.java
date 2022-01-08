package com.hotle.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.model.Customer;
import com.hotel.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {

	
	@Autowired
    private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
     
    public void save(Customer customer) {
    	customerRepository.save(customer);
    }
     
    public Customer get(Integer id) {
        return customerRepository.findById(id).get();
    }
     
    public void delete(Integer id) {
    	customerRepository.deleteById(id);
    }


	public Customer findByEmailIgnoreCase(String username) {
		// TODO Auto-generated method stub
		return customerRepository.findByEmailIgnoreCase(username);
	}
}
