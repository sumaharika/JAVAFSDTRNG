package com.ust.examples;
import java.io.*;
public class Example26 {
String name;
int id;
Example26(String name,int id)
{
this.name=name;
this.id=id;
}
public class Parameterizedconstructor{
	public static void main(String[] args) {
		Example26 Example261=new Example26("suma", 419);
		System.out.println("name:"+ Example261.name+"   id:" + Example261.id);
		
	}
}
}
