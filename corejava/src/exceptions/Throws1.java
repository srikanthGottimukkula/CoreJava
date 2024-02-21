package exceptions;

import java.io.*;
//Throwing Checked Exception
public class Throws1 {

	public static void method() throws FileNotFoundException {
		FileReader file = new FileReader(
				"D:\\Full Stack Developer\\Practice\\CoreJava(p)\\corejava\\src\\exceptions\\abc.txt");
		BufferedReader inputFile = new BufferedReader(file);

		throw new FileNotFoundException("file is not found!!");
	}

	public static void main(String[] args) {

		try {
			method();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		System.out.println("Rest code executed!!");

	}

}
