package com.capgemini.files.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.LineCount;

public class LineCountTest {

	private LineCount lineCount;
	
	@Test
	public void testLineCountIsCorrrect() throws IOException {
		lineCount = new LineCount("C:\\Akshay\\Core_Java\\file-handling\\test.txt");
		assertEquals(8, lineCount.checkLinesInFile());
	}

	
	@Test
	public void testLineCountIsNotCorrrect() throws IOException {
		lineCount = new LineCount("C:\\Akshay\\Core_Java\\file-handling\\test.txt");
		assertEquals(8, lineCount.checkLinesInFile());
	}
	
	@Test
	public void testFileIsEmpty() {
		lineCount = new LineCount("C:\\Akshay\\Core_Java\\file-handling\\test.txt");
		assertTrue(lineCount.checkFileIsEmpty());
	}
	
	@Test
	public void testFileIsPresent() {
		lineCount = new LineCount("C:\\Akshay\\Core_Java\\file-handling\\test.txt");
		assertTrue(lineCount.checkFileIsPresentOrNot());
	}

	@Test
	public void testFileIsNotPresent() {
		lineCount = new LineCount("C:\\Akshay\\Core_Java\\file-handling\\test1.txt");
		assertFalse(lineCount.checkFileIsPresentOrNot());
	}
}
