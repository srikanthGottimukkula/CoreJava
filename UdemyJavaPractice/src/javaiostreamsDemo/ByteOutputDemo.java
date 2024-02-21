package javaiostreamsDemo;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputDemo {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write('a');
		bos.write('b');
		bos.write('c');
		bos.write('d');
		bos.write('e');
		
//		byte b[]= bos.toByteArray();
//		for(byte x:b) {
//			System.out.println((char)x);
//		}
		
		bos.writeTo(new FileOutputStream("C:/Users/Srikanth Gmk/OneDrive/Documents/Test.txt"));
		bos.close();
		
		
		
	}

}
