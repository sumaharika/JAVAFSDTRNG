package com.ust.examples;
/*
 * constructor
 * 
 */
public class Example22 {
	int x;
	float y;
	String Z;
	
	Example22(){}
	Example22(int a, float b){
		x=a;
		y=b;
	}
	
	Example22(int a, float b,String Z){
		x=a;
		y=b;
		
	}
	
	public static void main(String[] args) {
		Example22 e1=new Example22();
		System.out.println(e1.x);
		Example22 e2=new Example22(2,3.0f);
    System.out.println(e2.y);
    Example22 e3=new Example22(3,4.0f,"suma");
    System.out.println(e3.Z);
	}

}
