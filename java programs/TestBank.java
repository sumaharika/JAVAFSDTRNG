package practice1;
// Abstract Example
abstract class Bank{
	abstract int getInterestRate(int x);
}
class HDFC extends Bank{
	int getInterestRate(int x){
		return x;
	}
}
class ICICI extends Bank{
	
	int getInterestRate(int y) {
		return y;
	}
}
public class TestBank {

	public static void main(String[] args) {
		Bank b= new HDFC();
		System.out.println(b.getInterestRate(2));
		
		b=new ICICI();
		System.out.println(b.getInterestRate(4));
	}

}
