package com.kadir.exception_management;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kadir.dto.DtoEmployee;
import com.kadir.service.IEmployeeSerice;
import com.kadir.starter.ExceptionManagementApplicationStarter;

@SpringBootTest(classes = { ExceptionManagementApplicationStarter.class })
class ExceptionManagementApplicationTests {

	// @Test
	// void contextLoads() {
	// }
	@Autowired
	private IEmployeeSerice employeeService;

	@BeforeEach
	public void setUp() {
		System.out.println("Starting setUp...");
		assertNotNull(employeeService);
		System.out.println("employeeService is not null.");
	}

	@Test
	public void testFindEmployeeById() {
		System.out.println("Starting testFindEmployeeById...");
		DtoEmployee employee = employeeService.findEmployeeById(1L);
		if (employee != null) {
			System.out.println("Employee Name: " + employee.getName());
			// Debug console da Employee Name: Kadir yazısını görebilirsiniz.
		}
	}

	@AfterEach
	public void tearDown() {
		System.out.println("Starting tearDown...");
	}

}
