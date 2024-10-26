package com.kadir.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadir.model.Employee;
import com.kadir.model.UpdateEmployeeRequest;
import com.kadir.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployeeList(){
		return employeeRepository.getAllEmployeeList();
		 
	}
	
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}
	
	public List<Employee> getEmployeesWithParams(String firstName,String lastName) {
		return employeeRepository.getEmployeesWithParams(firstName, lastName);
	}
	
	public Employee saveEmployee(Employee newEmployee) {
		return employeeRepository.saveEmployee(newEmployee);
	}
	
	public boolean deleteEmployee(String id) {
		return employeeRepository.deleteEmployee(id);
	}
	
	public Employee updatEmployee(String id, UpdateEmployeeRequest request) {
		return employeeRepository.updatEmployee(id, request); 
	}
}
