package practice1;

public class ExerciseException9 {
	@SuppressWarnings("finally")
	public static int returnTest(int num) {
		try {
			if(num==0) throw new Exception("Exception occured");
			else
				return 5;
		}
		catch (Exception e) {
			return 10;
		}
		
	}

	public static void main(String[] args) {
		System.out.println(returnTest(0));
	}

}
