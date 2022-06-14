package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository repository;

	
	@Override
	public Customer getCustomerById(String cstmId) {
		return repository.getCustomerById(cstmId);
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		return repository.getCustomers();
	}

	@Override
	public int insertCustomer(Customer customer) {
		return repository.insertCustomer(customer);
	}

}
