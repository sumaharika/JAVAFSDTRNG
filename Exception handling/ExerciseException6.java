package practice1;
import java.io.*;
class ThrowExample{
	void myMethod(int num)throws Exception, ClassNotFoundException{
		if(num==1)
			throw new IOException("IOException Occurred");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
	}
}
public class ExerciseException6 {

	public static void main(String[] args) {
		try {
			ThrowExample obj=new ThrowExample();
			obj.myMethod(1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
