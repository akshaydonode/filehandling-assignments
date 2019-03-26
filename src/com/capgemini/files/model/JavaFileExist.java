package com.capgemini.files.model;

import java.io.File;

public class JavaFileExist {
	
	private File file;
	private String path;

	public JavaFileExist(String string) {
		path = string;
		file = new File(path); 
	}

	public boolean checkFileIsPresentOrNot() {

		return file.exists();
	}

}
