package exceptions;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {

		String msg = "Hello I like Java Language, because its very easy";
		StringTokenizer str = new StringTokenizer(msg);
		System.out.println(str.countTokens());
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}

	}

}
