package com.kadir.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kadir.model.Employee;
import com.kadir.model.UpdateEmployeeRequest;

@Repository
public class EmployeeRepository {
	
	@Autowired
	private List<Employee> employeeList;
	
	
	public List<Employee> getAllEmployeeList(){
		
		return employeeList;
	}
	
	public Employee getEmployeeById(String id) {
		Employee findEmployee = null;
		for(Employee employee: employeeList) {
			if (id.equals(employee.getId())) {
				findEmployee = employee;
				break;
			}
		}
		return findEmployee;
	}
	
	public List<Employee> getEmployeesWithParams(String firstName,String lastName) {
	/*		List<Employee> employeeWithParams = new ArrayList<>();
		if (firstName==null && lastName == null) {
			return employeeList;
		}
		for (Employee employee : employeeList) {
			if (firstName!=null && lastName != null) {
				if (employee.getFirstName().equalsIgnoreCase(firstName) && employee.getLastName().equalsIgnoreCase(lastName)) {
					employeeWithParams.add(employee);
				}
			}
			if (firstName != null && lastName == null) {
				if (employee.getFirstName().equalsIgnoreCase(firstName)) {
					employeeWithParams.add(employee);
				}
			}
			if (lastName != null && firstName == null) {
				if (employee.getLastName().equalsIgnoreCase(lastName)) {
					employeeWithParams.add(employee);
				}
			}
		}
		return employeeWithParams
		*/
		// yukarıdaki ile aynı işlem ama daha kısa
		  return employeeList.stream()
		            .filter(employee -> (firstName == null || employee.getFirstName().equalsIgnoreCase(firstName)) &&
		                                (lastName == null || employee.getLastName().equalsIgnoreCase(lastName)))
		            .collect(Collectors.toList());
	}
	
	public Employee saveEmployee(Employee newEmployee) {
		employeeList.add(newEmployee);
		return newEmployee;
	}
	
	public boolean deleteEmployee(String id) {
		Employee deleteEmployee=null;
		for (Employee employee : employeeList) {
			if (id.equals(employee.getId())) {
			deleteEmployee = employee;
			break;
			}
		}
		if (deleteEmployee==null) {
			return false;
		}
		employeeList.remove(deleteEmployee);
		return true;
	}
	
	private Employee findEmployeeById(String id) {
		Employee findEmployee = null;
		for (Employee employee : employeeList) {
			if (employee.getId().equals(id)) {
				findEmployee = employee;
				break;
			}	
		}
		return findEmployee;
	}
	public Employee updatEmployee(String id, UpdateEmployeeRequest request) {
		Employee findEmployee = findEmployeeById(id);
		if (findEmployee!=null) {
			deleteEmployee(id);
			Employee updatEmployee = new Employee();
			updatEmployee.setId(id);
			updatEmployee.setFirstName(request.getFirstName());
			updatEmployee.setLastName(request.getLastName());
			
			employeeList.add(updatEmployee);
			
			return updatEmployee;
		}
		return null;
	}
}
