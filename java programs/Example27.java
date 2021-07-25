package practice1;
interface FirstInterface{
	public void myMethod();
}
interface SecondInterface{
	public void myotherMethod();
}
class Democlass2 implements FirstInterface, SecondInterface{
	public void myMethod() {
		System.out.println("some text...");
	}
	public void myotherMethod() {
		System.out.println("some other text...");
	}
}
 public class Example27 {

	public static void main(String[] args) {
		Democlass2  myObj=new Democlass2();
		myObj.myMethod();
		myObj.myotherMethod();
		

	}

}
