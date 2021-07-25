package practice1;
//local inner
public class Exercise20{
	private int data=30;
	void display() {
		class Local{
			void msg() {
				System.out.println(data);
			}
			
		}
		Local e1=new Local();
		e1.msg();
	}
	public static void main(String[] args) {
		Exercise20 obj= new Exercise20();
		obj.display();
		}
}
	
	

