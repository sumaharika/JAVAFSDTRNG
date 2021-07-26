package com.ust.examples;

import java.io.FileInputStream;

public class FileExample1 {

	public static void main(String[] args) {
		try {
			FileInputStream input=new FileInputStream("c:\\User\\ustjava");
			System.out.println("Data in the file");
			//reads the first byte
			int i=input.read();
			while(i!=-1) {
				System.out.print((char)i);
			//reads the second byte from the file
				i=input.read();
			}
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
