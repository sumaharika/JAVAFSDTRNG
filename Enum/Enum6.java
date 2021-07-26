package com.ust.examples;
enum Operation{
	PLUS,
	MINUS,
	TIMES,
	DIVIDE;
	double eval(double x,double y) {
		switch(this) {
		case PLUS:
			return x+y;
		case MINUS:
			return x-y;
		case TIMES:
			return x*y;
		case DIVIDE:
			return x/y;
			default:
				throw new AssertionError("Unknown operations"+ this);
		}
	}
public class Enum6 {

	/*public static void main(String[] args) {
		double result=Operation.PLUS.eval(4, 19);
		System.out.println(result);
	}*/
	public static void main(String args[]) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.eval(x, y));
    }

}
}
