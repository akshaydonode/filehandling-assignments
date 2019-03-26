package com.capgemini.files.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {

	private int count = 0;
	private File file;
	private FileReader fileReader;
	private String path;

	public LineCount(String string) {

		path = string;
		file = new File(path);
	}

	public long checkLinesInFile() throws IOException {

		fileReader = new FileReader(path);
		BufferedReader bReader = new BufferedReader(fileReader);

		while ((bReader.readLine()) != null) {

			count++;
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