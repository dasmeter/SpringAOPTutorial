package com.journaldev.spring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.journaldev.spring.model.Employee;

@Configuration
public class EmployeeService {

	private Employee employee;
	
	@Bean
	public Employee getEmployee(){
		return this.employee;
	}
	
	public void setEmployee(Employee e){
		this.employee=e;
	}
}
