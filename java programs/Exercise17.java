package practice1;

public class Exercise17 {
	int x;
	String name;
	void outerMethod() {
		System.out.println(" Inside outerMethod");

	//inner class is a local to outerMethod()
	class Inner{
		void innerMethod() {
			System.out.println("Inside InnerMethod");
		}
	}
	Inner y=new Inner();
	y.innerMethod();
}

	public static void main(String[] args) {
		Exercise17 outer=new Exercise17();
		outer.outerMethod();

	}

}
