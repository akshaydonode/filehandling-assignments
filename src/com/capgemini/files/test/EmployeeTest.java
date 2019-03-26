package com.capgemini.files.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.Employee;
import com.capgemini.files.model.EmployeeDeserialization;
import com.capgemini.files.model.EmployeeSerialization;

public class EmployeeTest {

	private Employee employee;
	private EmployeeSerialization employeeSerialization;
	private EmployeeDeserialization employeeDeserialization;
	
	@Test
	public void testEmployeeSerialization() throws IOException {
		employee = new Employee(101, "John Doe", 45000);
		employeeSerialization = new EmployeeSerialization();
		assertTrue(employeeSerialization.writeObjectInFile("employee.ser", employee));
	}
	
	@Test
	public void testEmployeeDeSerialization() throws IOException, ClassNotFoundException {
		employee = new Employee(101, "John Doe", 45000);
		employeeDeserialization = new EmployeeDeserialization();
		assertEquals(employee, employeeDeserialization.deSerialize("employee.ser"));
	}
}
