package function;

import java.util.Scanner;
import java.util.function.Function;

public class AuthFunctionChaining {
	public static void main(String[] args) {

		Function<String, String> f1 = s -> s.toLowerCase();
		Function<String, String> f2 = s -> s.substring(0, 8);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter userName!!");
		String username = sc.next();
		System.out.println("Enter Password!!");
		String pwd = sc.next();

		if (f1.andThen(f2).apply(username).equals("srikanth") && pwd.equals("java123")) {
			System.out.println("Valid user !! Welcome ");
		} else {
			System.out.println("invalid user!!");
		}

	}
}
