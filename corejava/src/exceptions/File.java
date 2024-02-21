package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class File {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("abc.txt");
			System.out.println("File is open!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("File Saved Successfully!!!");

	}

}
