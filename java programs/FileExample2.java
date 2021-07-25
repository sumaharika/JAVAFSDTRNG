package practice1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileExample2 {

	public static void main(String[] args) {
	try {
		File fName=new File("c:ExampleFile.txt");
		if(fName.createNewFile()) {
			System.out.println("file is created");
		}
		else {
			System.out.println("file already exist");
		}
		System.out.println(fName.canRead());
	   System.out.println(fName.canWrite());
	   System.err.println("Error is found");
	   Scanner s=new Scanner(System.in);
	   String txt = s.nextLine();
	   System.out.println(txt);
	   fName.setReadable(false);
	   fName.setWritable(false);
	   fName.setWritable(false,false);
	
	
		}
	catch(IOException c) {
		c.printStackTrace();
	}


	}
}


