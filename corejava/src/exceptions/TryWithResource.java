
package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Demo implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("close is called!!");

	}

}

public class TryWithResource {

	public static void main(String[] args) {
		try (PrintWriter pw = new PrintWriter("abc.txt");
				Demo obj = new Demo();) {

			pw.write("HELLO WORLD!!");
			System.out.println("contetnt  written inside");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
