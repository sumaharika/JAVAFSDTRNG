package practice1;

public class Exercise22 {
	private void getValue() {
		int sum=20;
		class Inner
		{
			public int divisor;
			public int remainder;
			public Inner() {
				divisor=4;
				remainder = sum%divisor;
			}
			private int getDivisor()
			{
				return divisor;
			}
			private int getRemainder() {
				return sum%divisor;
			}
				private int getQuotient() {
					System.out.println("inside inner class");
					return sum/divisor;
				}
			}
		Inner inner=new Inner();
		System.out.println("Divisor="+inner.getDivisor());
		System.out.println("Remainder="+inner.getRemainder());
		System.out.println("Quotient="+inner.getQuotient());
		
	}
		
public static void main(String[] args) {
	Exercise22 outer=new Exercise22();
	outer.getValue();
		
	}

}
