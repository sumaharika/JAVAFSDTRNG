package com.ust.examples;

import java.io.File;

public class FileExample3 {

	public static void main(String[] args) {
	File file=new File("file");
	try {
		
		file.createNewFile();
	}
	catch (Exception e) {
		e.getStackTrace();
	}
	File newFile = new File("Example");
	boolean value=file.renameTo(newFile);
	if(value) {
		System.out.println("the name of the file is changed");
	}
	else {
		System.out.println("the name cannot be changed");
	}
	}


}
