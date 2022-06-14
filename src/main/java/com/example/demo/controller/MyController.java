package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.MyService;

@RestController //@Controller + @ResponseBody
//@Controller
public class MyController {
	
	@Autowired
	MyService service;
	
	@GetMapping("/hi")
	public String hello() {
		return "Hello demo";
	}
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello " + name;
	}
	
	@GetMapping("/users")
	public List<String> getList(){
		return service.getList();
	}
	
	@RequestMapping(value="/old", method = RequestMethod.GET)
	public @ResponseBody String getText() {
		return "Text...";
	}
	
	@PostMapping("/entity")
	public String createCustomer(@RequestBody Customer customer) {
		if(customer != null) {
			return customer.show();
		} else {
			return "Fail";
		}
	}

}
