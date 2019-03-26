package com.capgemini.files.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.LineCount;
import com.capgemini.files.model.WordCount;

public class WordCountTest {

	
	private WordCount wordCount;
	
	
	
	@Test
	public void testFileIsPresent() {
		wordCount = new WordCount("C:\\Akshay\\Core_Java\\file-handling\\test.txt");
		assertTrue(wordCount.checkFileIsPresentOrNot());
	}

	@Test
	public void testFileIsNotPresent() {
		wordCount = new WordCount("C:\\Akshay\\Core_Java\\file-handling\\test1.txt");
		assertFalse(wordCount.checkFileIsPresentOrNot());
	}
	
	@Test
	public void testFileIsEmpty() {
		wordCount = new WordCount("C:\\Akshay\\Core_Java\\file-handling\\test.txt");
		assertTrue(wordCount.checkFileIsEmpty());
	}
	
	@Test
	public void testCountingWordFromFile() throws IOException {
		wordCount = new WordCount("C:\\Akshay\\Core_Java\\file-handling\\test.txt");
		assertEquals(20, wordCount.getWordCountFromFile());
	}
	
	@Test
	public void testCountingWordFromFileIsFalse() throws IOException {
		wordCount = new WordCount("C:\\Akshay\\Core_Java\\file-handling\\test.txt");
		
		/*
		 * assertEquals(20, wordCount.getWordCountFromFile());
		 */
	}
}
