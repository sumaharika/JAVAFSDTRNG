package practice1;

public class ExerciseException2 {

	public static void main(String[] args) {
	try {
		int divideByZero=5/0;
	}
	catch(ArithmeticException e) {
	
	System.out.println("ArithmeticException=>"+e.getMessage());
	}
	finally {
		System.out.println("this is the finally block");
		}
	}

}
