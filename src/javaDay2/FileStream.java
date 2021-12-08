package javaDay2;
import java.io.*;


public class FileStream {
public static void main(String[] args) {
	
	String str ="hello";
	byte[] b = str.getBytes();
	
	try {
		OutputStream o= new FileOutputStream("C:\\pra\\test.txt"); 
		for(byte read:b) {
			o.write(read);
			
		}
		o.close();
	
		InputStream is = new FileInputStream("C:\\pra\\test.txt");
		int size = is.available();
		for(int i =0;i<size;i++) {
			System.out.print((char)is.read());
		}
		is.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
