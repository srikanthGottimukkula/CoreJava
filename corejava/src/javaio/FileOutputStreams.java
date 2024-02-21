package javaio;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreams {

	public static void main(String[] args) {
		
//		try {
//			FileOutputStream fos = new FileOutputStream("C://Users//Srikanth Gmk//OneDrive//Documents//Test.txt");
//			String str ="Learn Java programming!!";
//			byte b[] = str.getBytes();
//			fos.write(b, 8, str.length()-8);
//			fos.close();
//			
//		} 
		try {
			FileOutputStream fos = new FileOutputStream("C://Users//Srikanth Gmk//OneDrive//Documents//Test.txt");
			String str ="LEARN JAVA PROGRAMMING!!";
			byte b[] = str.getBytes();
			fos.write(b);
			
		} 
		catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}
