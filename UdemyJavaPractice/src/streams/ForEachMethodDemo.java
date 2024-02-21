package streams;

import java.util.ArrayList;

public class ForEachMethodDemo {
	public static void main(String[] args) {

		ArrayList<String> s = new ArrayList<String>();
		s.add("Srikanth");
		s.add("Ram");
		s.add("Abhiram");
		s.add("venkat");

		s.stream().forEach(sv -> System.out.println("LambadExpression using: "+ sv));
		s.stream().forEach(System.out::println);

	}
}
