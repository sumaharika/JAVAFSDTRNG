package practice1;

import java.io.FileOutputStream;

public class FileExample3 {

  public static void main(String args[]) {

     try {
       /* FileInputStream input = new FileInputStream("C:\Users\Su-ma\eclipse-workspace\practice1);

        System.out.println("Data in the file: ");

        // Reads the first byte
        int i = input.read();

       while(i != -1) {
           System.out.print((char)i);

           // Reads next byte from the file
           i = input.read();
        }
        input.close();*/
     String s="output file";
     FileOutputStream output=new FileOutputStream("C:\\Users\\Su-ma\\eclipse-workspace\\practice1\\File1.txt");
    output.write(s.getBytes());
    output.close();
     }
     catch(Exception e) {
        e.getStackTrace();
     }
  }
}