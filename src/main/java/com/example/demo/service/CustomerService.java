package com.example.demo.service;

import java.util.Collection;

import com.example.demo.entity.Customer;

public interface CustomerService {
	Customer getCustomerById(String cstmId);
	Collection<Customer> getAllCustomers();
	int insertCustomer(Customer customer);
}
