package javaiostreamsDemo;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayDemo {
	public static void main(String[] args) throws IOException {
		char c[] = { 'a', 'b', 'c', 'd' };
		CharArrayReader car = new CharArrayReader(c);
		int x;
		while ((x = car.read()) != -1) {
			System.out.println((char) x);
		}

		car.close();

	}
}
