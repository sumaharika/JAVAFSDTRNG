package practice1;



import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExampleFile {

	public static void main(String[] args) {
		try {
		File f=new File("c:File1.txt");
		/*if(f.createNewFile()){
			System.out.println(f.getName()+"is created");
		}
			else {
				System.out.println("already exists");
			
		}*/
		//f.write("this is a java training");
		//f.close();
		//Scanner read=new Scanner (f);
		FileReader read=new FileReader(f);
		/*while(read.hasNextLine()) {
			String data = read.nextLine();
			System.out.println(data);
			
		}*/
		int ch;
			while((ch=read.read())!=-1){
			System.out.print((char)ch);
			
		}
		read.close();
	}
		catch(IOException e) {
			System.out.println("Exception Occured");
		}
	}
}

