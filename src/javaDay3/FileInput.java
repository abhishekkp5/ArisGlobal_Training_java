package javaDay3;

import java.io.*;


public class FileInput {
	public static void main(String[] args) {
	
		try {
			
			 FileOutputStream fout = new FileOutputStream("c:\\javaClass\\test1.txt");					
			 ByteArrayOutputStream bout = new ByteArrayOutputStream();
			 InputStream in = new FileInputStream("c:\\javaClass\\test.txt");
			 
			 bout.write(in.readAllBytes());
			 in.close();
			 bout.writeTo(fout);
			 bout.flush();
			 bout.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
