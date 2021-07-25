package practice1;
//final example
class vehicle1{
		int x=5;
		vehicle1(){
			System.out.println("Vehicle class constructor");
		} 
		/*final void changeGear() {
			System.out.println("automatic");
		}*/
		void changeGear() {
			System.out.println("automatic");
		}
	}
	 class Honda1 extends vehicle1{
		/* void changeGear1() {
		System.out.println("automatic variant in subclass");
		super.changeGear();
	}*/
		 void changeGear() {
			 System.out.println("automatic variant in subclass");
		 }
	 }
		 
	public class TestFinal{

		public static void main(String[] args) {
			vehicle1 v = new Honda1();
			vehicle1 v1= new vehicle1();
			//Honda1 h1=(Honda1)new vehicle1();
			//h1.changeGear();
			System.out.println(v.x);
			v.changeGear();
			v1.changeGear();
		}

	}




