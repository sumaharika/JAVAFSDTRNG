package practice1;

public class Exercise21 {
	private int data=30;
	void display() {
		int value=50;
		class Local{
			void msg() {
				System.out.println(value);
			}
			
		}
		Local e1=new Local();
		e1.msg();
	}

	public static void main(String[] args) {
		Exercise21 e2=new Exercise21();
		e2.display();

	}

}
