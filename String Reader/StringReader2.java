package com.ust.examples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class StringReader2 {

	public static void main(String[] arg) throws IOException{
		char[] buff=new char[1024];
		StringWriter sw=new StringWriter();
        FileInputStream fis=null;
        BufferedReader bufferReader=null;
        try {
        	fis=new FileInputStream("c:File1.txt");
        	bufferReader = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
        	int n;
        	while((n=bufferReader.read(buff))!=-1) {
        		sw.write(buff,0,n);
        	}
        	System.out.println(sw.toString());
        }
        catch(IOException e) {
        	e.printStackTrace();
        	}
        finally {
        	sw.close();
        	bufferReader.close();
        	}
	}

}
