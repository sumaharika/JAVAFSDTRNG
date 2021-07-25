package practice1;
//TestAnonymousInner
abstract class person{
	abstract void eat();
}
class Exercise23{
	public static void main(String args[]) {
		person e1=new person(){
			void eat() {
				System.out.println("nice fruits");
			}
		};
			
		e1.eat();
}
}
	