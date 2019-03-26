package com.capgemini.files.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {

	public boolean writeObjectInFile(String fileName, Object obj) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
		
		outputStream.writeObject(obj);
		outputStream.close();
		
		File file = new File(fileName);
		return file.exists();
		
	}
}
