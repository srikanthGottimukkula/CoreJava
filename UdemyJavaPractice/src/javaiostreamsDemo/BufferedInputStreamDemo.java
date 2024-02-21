package javaiostreamsDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

//BufferedInputStream and FileInputStream

public class BufferedInputStreamDemo {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:/Users/Srikanth Gmk/OneDrive/Documents/Test2.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		System.out.print((char) bis.read());
		System.out.print((char) bis.read());
		System.out.print((char) bis.read());
		bis.mark(10);
		System.out.print((char) bis.read());
		System.out.print((char) bis.read());
		bis.reset();
		System.out.print((char) bis.read());
		System.out.print((char) bis.read());

	}
}
