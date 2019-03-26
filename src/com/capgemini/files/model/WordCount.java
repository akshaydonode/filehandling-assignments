package com.capgemini.files.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	private String path;
	private String lineCount;
	private int count = 0;
	private FileReader fileReader;
	private File file;
	
	public WordCount(String string) {
	
		path = string;
		file=new File(path);
	}

	public long getWordCountFromFile() throws IOException {
		
		fileReader = new FileReader(path);
		BufferedReader bReader = new BufferedReader(fileReader);
		
		while ((lineCount = bReader.readLine()) != null) {
			if(!(lineCount.equals(""))) 
            { 
				  String[] wordList = lineCount.split("\\s+[^.]"); 
                  
	                count += wordList.length; 
            }
		}
		
		return count;
	}
	

	public boolean checkFileIsPresentOrNot() {

		return file.exists();
	}
	
	public boolean checkFileIsEmpty() {
		if(file.length()==0)
			return false;
		return true;
	}

}
