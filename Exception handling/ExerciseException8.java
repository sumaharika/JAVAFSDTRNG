package practice1;

public class ExerciseException8 {

	public static void main(String[] args) {
	try {
		ExerciseException8 met = new ExerciseException8();
		System.out.println("length of JUNK is "+ met.getStringSize("JUNK"));
		System.out.println("length of WRONG is "+ met.getStringSize("WRONG"));
		System.out.println("length of null is "+ met.getStringSize("null"));
	}
	catch (Exception e) {
		System.out.println("Exception message:"+e.getMessage());
		
	}

	}
	public int getStringSize(String str) throws Exception{
		if(str==null) {
			throw new Exception("String input is null");
		}
		return str.length();
	}

}
