package javaDay2;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
		public static void main(String[] args) {
			
			String data = "Abhishek";
			try {
				FileWriter fw = new FileWriter("c:\\javaClass\\test.txt");
				fw.write(data);
				fw.close();
			}
			catch(Exception e) {
				e.getStackTrace();
				
			}
			char[] arr = new char[20];
			try {
				FileReader fr = new FileReader("c:\\javaClass\\test.txt");
				fr.read(arr);
				System.out.println(arr);
				fr.close();
			}
			catch(Exception e){
				e.getStackTrace();				
			}
		}
}
