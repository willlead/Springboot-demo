package com.example.demo.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
	
	public List<String> list(){
		return Arrays.asList("홍길동","이순신","윤길동");
	}

}
