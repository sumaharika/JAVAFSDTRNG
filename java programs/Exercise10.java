package practice1;
	public class Exercise10 {
		 final static String NAME = "CONFIG";
		 final long initTime; Exercise10() {
			 this.initTime = System.currentTimeMillis();
		 }
		 public static void main(String[] args) {
			 Exercise10 cfg1 = new Exercise10(); 
		 System.out.println(cfg1.initTime);
		 Exercise10 cfg2 = new Exercise10();
		 System.out.println(cfg2.initTime);
		 }
	}




	

