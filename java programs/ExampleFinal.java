package practice1;
/*
 * 
 * final variable,final method,final class
 */

public class ExampleFinal {
	int a;
	final int b;
	ExampleFinal(){
		a=7;
		b=2;
	}
	public static void main(String[] args) {
		final int x;
		x=10;
		System.out.println(x);
		ExampleFinal e=new ExampleFinal();
		System.out.println(e.a);
		System.out.println(e.b);
		e.a=3;
		System.out.println(e.a);
		
	}
	

}
