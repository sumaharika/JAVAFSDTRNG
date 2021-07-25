package practice1;

public class BankException extends Exception {
	static String err="error";
	BankException(String message){
		super(message);	
	}
	public static void main(String[] args) throws BankException{
		if(err.equals("error")){
			System.out.println("error message");
		}
		else 
			throw new BankException("BankException");
		
	}

}
