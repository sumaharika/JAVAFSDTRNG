package com.ust.examples;

import java.io.FileReader;

public class FileExample2 {

	public static void main(String[] args) {
	char[]array=new char[100];
	try {
		FileReader input=new FileReader("C:\\Users\\ustjava26\\eclipse-workspace\\practice\\File1.txt");
		input.read(array);
		System.out.println("Data in the file");
		System.out.println(array);
		input.close();
	}
	catch(Exception e) {
	e.getStackTrace();
	
	}

}
}

