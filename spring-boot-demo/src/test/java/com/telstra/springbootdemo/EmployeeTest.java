package com.telstra.springbootdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.telstra.springbootdemo.model.Employee;
import org.junit.jupiter.api.Test;
public class EmployeeTest {
	
	@Test
	public void getSalaryTest() {
		Employee employee=new Employee(1001,"ram","manager",50000);
		assertEquals(50000,employee.getSalary());
	}
}
