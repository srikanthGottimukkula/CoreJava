package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryWithResource1 {
	
	public static void main(String[] args) {
		try(PrintWriter pw = new PrintWriter("abc.txt");){
			pw.write("Hello world!!");
			System.out.println("Content is writtern inside the file!!");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}

}
