package javaiostreamsDemo.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectInputStreamDemo{
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:/Users/Srikanth Gmk/OneDrive/Documents/std2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student2 s = (Student2) ois.readObject();
		System.out.println(s);
		ois.close();
		fis.close();

	}
}
