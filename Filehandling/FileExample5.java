package com.ust.examples;

import java.io.File;

public class FileExample5 {

	public static void main(String[] args) {
	File file=new File("C:\\Users\\ustjava26");
	String[] fileList=file.list();
	for(String str:fileList) {
		System.out.println(str);
	}
	}

}
