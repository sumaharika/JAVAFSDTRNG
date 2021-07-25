package practice1;
/*
 * example of inner class
 */

public class Exercise14 {
     int x=5;
	
	 private void display() {
		System.out.println("outer class");
	}
	private class Inner{
		private int y;
		public void display() {
		}
		Inner(int y){
			this.y=y;
		}
	
		//void display() {
		//	System.out.println("example of inner class");
		//}
	}
	
	public static void main(String[] args) {
		Exercise14.Inner e1=new Exercise14().new Inner(6);
		 
		Exercise14 e2=new Exercise14();
		e2.display();
		e2.x=5;
	    e1.display();
		System.out.println(e2.x);
		e1.display();
		

	}

}
