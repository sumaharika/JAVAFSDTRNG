package practice1;
interface Animals2{
	public void animalSound1();
	public void sleep();
	}
    class Pig implements Animals2{
	public void animalSound1() {
		System.out.println("The pig says:wee wee");		
	}
	public void sleep() {
		System.out.println("sleep:Zzz");
	}
	}

public class Exercise26 {

	public static void main(String[] args) {
   Pig myPig = new Pig();
   myPig.animalSound1();
   myPig.sleep();
	}


}
