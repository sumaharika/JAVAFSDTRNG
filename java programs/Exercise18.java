package practice1;
/*
 * Nested inner class 
 * 
 */

public class Exercise18 {
	class Inner{
		public void show() {
			System.out.println("in a nested class method");
		}
	}

	public static void main(String[] args) {
		Exercise18.Inner e1= new Exercise18().new Inner();
		e1.show();
		

	}

}
