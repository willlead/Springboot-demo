package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Customer {
	String id;
	String name;
	String address;
	
	public String show() {
		return getName() +"("+getId()+") "+getAddress();
	}
}
