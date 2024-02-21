package javaiostreamsDemo;

import java.io.ByteArrayInputStream;

public class ByteInputDemo {
	public static void main(String[] args) throws Exception {
		byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		ByteArrayInputStream bis = new ByteArrayInputStream(b);

		int x;
		while ((x = bis.read()) != -1) {
			System.out.println((char)x);
		}
		System.out.println(bis.markSupported());
		
//		String str = new String(bis.readAllBytes());
//		System.out.println(str);
		
		bis.close();
	}

}
