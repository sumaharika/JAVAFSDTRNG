package com.ust.examples;

public class WrapExample {

	public static void main(String[] args) {
		int i=5;
		Integer obj=new Integer(i);
		i=obj.intValue();
		double d=5.5;
		Double d1=new Double(d);
		double d2=obj.doubleValue();
		System.out.println("int value of Double object,obj:"+i);
		System.out.println(obj.doubleValue());
		
		
	}

}
