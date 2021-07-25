package practice1;
/*
 * 
 * Upcasting&Downcasting
 */

public class CastExample {

	public static void main(String[] args) {
		double num=15.95;
		System.out.println(num);
		int n=(int) num;//down casting the double type to int type
	System.out.println(n);
	int x=78;
	double y= x;
	System.out.println(x);
	System.out.println(y);
	float z=(float)3.67;
	byte d=(byte)z;
			System.out.println(z);
			System.out.println(d);
	long b=1895;
	float e=(float)b;
	System.out.println(b);
	System.out.println(e);
	int c=4;
	String dbValue=String.valueOf(c);
	System.out.println(dbValue);
	dbValue =String.valueOf(c);
	System.out.println(dbValue);
	dbValue =String.valueOf(x);
	System.out.println(dbValue);
	dbValue =String.valueOf(num);
	System.out.println(dbValue);
	}
	
	
	}


