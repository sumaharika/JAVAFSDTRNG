package com.ust.examples;

class Bank{
	private int accountNo;
	private String accountName;
	private float accountBalance;
	void printBankdetails() {
	System.out.println(accountNo+" \n"+accountName+"\n"+accountBalance);	
	}
	
	protected void insertBankData(int x,String y,float z) {
		accountNo=x;
		accountName=y;
		accountBalance=z;
	}
}
class Example29{

	public static void main(String[] args) {
     Bank e1= new Bank();
     e1.insertBankData(12345, "suma",10000);
    e1.printBankdetails();
	}

}
