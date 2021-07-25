package practice1;
class StudentNotFoundException extends Exception{
	public StudentNotFoundException(String message) {
		super(message);
	}
}

class StudentManager {
	public Student Find(String studentID)throws StudentNotFoundException{
		 if (studentID.equals("123456")) {
	            return new Student();
	        } else {
	            throw new StudentNotFoundException(
	                "Could not find student with ID " + studentID);
	        }
	    }
}
public class ExerciseException10 {
	    public static void main(String[] args) {
	        StudentManager manager = new StudentManager();
	 
	        try {
	 
	            Student student = manager.Find("0000001");
	 
	        } catch (StudentNotFoundException ex) {
	            System.err.print(ex);
	        }
	    }
	}
	

	