package com.ust.examples;
/*
 * 
 * copy constructor
 */

public class Example25 {
	String web;
	Example25(String w) {
		web=w;
	}
	Example25(Example25 cc){
		web= cc.web;
	}
    void disp() {
    	System.out.println("constructor:"+web);
    }
	public static void main(String[] args) {
		Example25 obj1=new Example25("Example of Example25 in java");
		Example25 obj2=new Example25(obj1);
		obj1.disp();
		obj2.disp();
	}
}


	


