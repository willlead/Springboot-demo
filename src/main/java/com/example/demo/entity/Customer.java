package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {
	String id;
	String name;
	String address;
	
	public String show() {
		return getName() +"("+getId()+") "+getAddress();
	}
}
