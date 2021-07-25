package practice1;

import practice1.Exercise18.Inner;

public class Exercise19 {
	static class Nested{
	public void my_method() {
		System.out.println("this is my nested class");
	}
	}
	private static int count;
	public static void main(String[] args) {
	Exercise19.Nested nested= new Exercise19.Nested();
	Exercise19.count=1;
	nested.my_method();
	Exercise18.Inner e1= new Exercise18().new Inner();
	}

}
