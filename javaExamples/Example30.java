package com.ust.examples;
//credit class is super class
public class Example30 {
private String cardName;
private int expiryDate;
private Float creditBalance;

Example30(){
	cardName="suma";
	expiryDate=03/11/2021;
	creditBalance=50000.0f;
}

void checkCardBalance() {
	if(creditBalance>40000) {
		System.out.println("sufficient balance");
		}
	else
	{
		System.out.println("not much");
	}

}
void makePayment() {
	
}
public static void main(String[] args) {
	//visa v= new visa("suma",123,30000.0f);
	visa v=new visa();
	v.checkCardBalance();
	
}
}
//visa as a sub class
class visa extends Example30{
		float interestRate;
		float creditLimit;
		
		//visa(String x, int y,float z){
		visa(){
			super();
		}
		void checkDiscount() {
			System.out.println("many discounts to be provided");
}
}
//MasterCard as a sub class
class MasterCard extends Example30{
	void checkPayment() {
		System.out.println("online payment mode is available");
	}
}

	
	


