package practice1;

public class ExerciseException5 {

	public static void main(String[] args) {
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[7]);
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the specified index does not exist" + " "+  "in array.please correct the error.");
			
		}
	}
	

}
