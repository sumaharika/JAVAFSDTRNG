package com.ust.examples;
/*
 * methods overloading
 * 
 */
public class example8 {
	int x;
	int y;
	int calculate(int a, int b) {//a,b are parameters
		 return  a+b;
	 }
	float calculate(float a, float b) {//a,b are parameters
		 return  a+b;
	 }
	 String calculate (String a,String b) {
		 return a+b;
	 }
	void calculate (String a) {
	 }
	{
		int z=5;
		System.out.println("z="+z);//blocks
	}
	int z=7;
	
	public static void main(String[] args) {
		example8 e= new example8();
	   int m= e.calculate(5,6);
	   float n= e.calculate(5.6f,6.5f);
	   String o= e.calculate("Hello","World");
	System.out.println(m);
	System.out.println(n);
	System.out.println(o);
		
	
	 

	}

}
