package com.capgemini.files.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import com.capgemini.files.custom_exception.StringNotFoundException;

public class JavaGrepApplication {

	private String path;
	private BufferedReader bReader;
	private HashMap<Integer, String> actualHashMap = new HashMap<Integer, String>();
	private String content;
	private int lineCount;
	private File file;
	
	public JavaGrepApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JavaGrepApplication(String path) throws FileNotFoundException {
		super();
		this.path = path;
		bReader = new BufferedReader(new FileReader(path));
		
		file = new File(path);
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public HashMap<Integer, String> findString(String string) throws IOException, StringNotFoundException  {
		while((content = bReader.readLine()) != null) {
			lineCount++;
			String[] line = content.trim().split(" ");
			for(int i=0;i<line.length;i++)
			{
				if(line[i].equals(string))
				{
					actualHashMap.put(lineCount, content);
				}
			}
		}
		if(actualHashMap.isEmpty())
			throw new StringNotFoundException("String was not found");
		return actualHashMap;
		
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
