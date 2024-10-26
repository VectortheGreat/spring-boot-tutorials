package com.kadir.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kadir.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList(){
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1","Kadir","Topçu"));
		employeeList.add(new Employee("2","Ali","Dağ"));
		employeeList.add(new Employee("3","Ayşen","Gül"));
		employeeList.add(new Employee("4","Ahmet","Ozan"));
		return employeeList;
	}
	
}
