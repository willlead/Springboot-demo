package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MyRepository;

@Service
public class MyService {
	
	@Autowired
	MyRepository repository;
	
	public List<String> getList(){
		return repository.list();
	}

}
