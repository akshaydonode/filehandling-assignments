package com.capgemini.files.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {

	public Object deSerialize(String fileName) throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream(fileName);
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		
		Employee employee = (Employee)inputStream.readObject();
		
		return employee;
		
	}
}
