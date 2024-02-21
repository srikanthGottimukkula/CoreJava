package javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Desination {

	// TWO INPUT FILES MOVED INTO DESTINATION FILES

	public static void main(String[] args) throws Exception {

		FileInputStream fis1 = new FileInputStream("C://Users//Srikanth Gmk//OneDrive//Documents//Test.txt");
		FileInputStream fis2 = new FileInputStream("C://Users//Srikanth Gmk//OneDrive//Documents//Test2.txt");

		FileOutputStream fos = new FileOutputStream("C://Users//Srikanth Gmk//OneDrive//Documents//Desitination.txt");

		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

		int a;
		while ((a = sis.read()) != -1) {
			fos.write(a);
		}

		fis1.close();
		fis2.close();
		sis.close();
		fos.close();

	}

}
