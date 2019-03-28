package com.journaldev.spring.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.journaldev.spring.aspect.Loggable;

@Configuration
public class Employee {

	private String name;
	
	
	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String nm) {
		this.name=nm;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}
	
}
