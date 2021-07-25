package practice1;

 class Base {
	 void display() {
		System.out.println("Base method call");
	}
}
class Derived extends Base{
	
		void display() {
			System.out.println("Base method call");
		}
	}
	class Exercise9{
		public static void main(String[]ards)
		{
			Derived d=new Derived();
			d.display();
		}
	}
	

	