package com.ust.examples;

//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		try {
			FileWriter f=new FileWriter("c:File1.txt");
			/*if(f.createNewFile()) {
				System.out.println(f.getName()+"is created");
				}
			else {
				System.out.println("already exists");
			}*/
			f.write("this is a java training");
			f.close();
		}
	       catch(IOException e) {
				System.out.println("Exception occured");
			}
			
		
	}

}
