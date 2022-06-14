package com.example.demo.repository;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;

@Repository
public class CustomerRepository {
	HashMap<String, Customer> db = new HashMap<>();
	{
		db.put("hong", Customer.builder().id("hong").name("홍길동").address("서울").build());
		db.put("you", Customer.builder().id("you").name("유관순").address("광주").build());
		db.put("lee", Customer.builder().id("lee").name("이순신").address("부산").build());
		db.put("hae", Customer.builder().id("hae").name("해모수").address("대전").build());
	}
	public Customer getCustomerById(String cstmId) {
		return db.get(cstmId);
	}
	public Collection<Customer> getCustomers(){
		return db.values();
	}
}

