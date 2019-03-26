package com.capgemini.files.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.files.model.JavaFileExist;

public class JavaFileExistTest {

	private JavaFileExist fileExist;
	
	@Test
	public void testWhetherFileExist() {
		fileExist = new JavaFileExist("C:\\Akshay\\Core_Java\\file-handling\\src\\com\\capgemini\\files\\client\\FileHandlingdemo.java");
		assertTrue(fileExist.checkFileIsPresentOrNot());
	}


	@Test
	public void testWhetherFileIsNotExist() {
		fileExist = new JavaFileExist("C:\\Akshay\\Core_Java\\file-handling\\src\\com\\capgemini\\files\\client\\FileHandlingdemo1.java");
		assertFalse(fileExist.checkFileIsPresentOrNot());
	}

	
}
