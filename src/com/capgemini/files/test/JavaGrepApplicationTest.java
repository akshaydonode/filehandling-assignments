package com.capgemini.files.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.junit.Test;

import com.capgemini.files.custom_exception.StringNotFoundException;
import com.capgemini.files.model.JavaGrepApplication;
import com.capgemini.files.model.LineCount;

public class JavaGrepApplicationTest {

	private JavaGrepApplication javaGrepApplication;

	@Test
	public void testWhenStringIsFound() throws IOException, StringNotFoundException {
		javaGrepApplication = new JavaGrepApplication("C:\\Akshay\\Assignments\\assignments_io.txt");
		HashMap<Integer, String> expectedMap = new HashMap<Integer, String>();
		// expectedMap.put(20, "HINT:- Use Serialization and Deserialization");
		// expectedMap.put(28, "HINT:- Use Serialization and Desrialization with
		// Collection");
		expectedMap.put(16, "Create a class with main() write a code to persist the object in the file.");
		assertEquals(expectedMap, javaGrepApplication.findString("persist"));
	}

	@Test(expected = StringNotFoundException.class)
	public void testWhenStringIsNotFound() throws IOException, StringNotFoundException {
		javaGrepApplication = new JavaGrepApplication("C:\\Akshay\\Assignments\\assignments_io.txt");
		javaGrepApplication.findString("andthe");
	}

	@Test
	public void testFileIsEmpty() throws FileNotFoundException {
		javaGrepApplication = new JavaGrepApplication("C:\\Akshay\\Assignments\\assignments_io.txt");
		assertTrue(javaGrepApplication.checkFileIsEmpty());
	}

	@Test
	public void testFileIsPresent() throws FileNotFoundException {
		javaGrepApplication = new JavaGrepApplication("C:\\Akshay\\Assignments\\assignments_io.txt");
		assertTrue(javaGrepApplication.checkFileIsPresentOrNot());
	}

	@Test(expected = FileNotFoundException.class)
	public void testFileIsNotPresent() throws FileNotFoundException {
		javaGrepApplication = new JavaGrepApplication("C:\\Akshay\\Assignments\\assignments_i2o.txt");
		assertFalse(javaGrepApplication.checkFileIsPresentOrNot());
	}

}
