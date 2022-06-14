package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService service;

	@GetMapping("/customer/{cstmId}")
	public Customer findCustomerWithId(@PathVariable String cstmId) {
		return service.getCustomerById(cstmId);
	}
	
	@GetMapping("/customer")
	public Collection<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}
	
	@PostMapping("/customer/insertCustomer")
	public int createCustomer(@RequestBody Customer customer) {
		return service.insertCustomer(customer);
	}
}
