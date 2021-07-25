package practice1;
class Base1{
	final void foo(int i)
{
		System.out.println(i);
		}
	void foo(int i,String s) {
		System.out.println(i + "  "+s);
	}
}
class child extends Base1{
	void foo (int i, String s) {
		System.out.println(i+" "+s);
	}
}
public class Exercise11{
	public static void main(String[]args) {
	child c = new child();
	c.foo(14);
	c.foo(14,"suma");
}
}