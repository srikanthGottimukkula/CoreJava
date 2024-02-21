package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
	String userName;
	String password;

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

}
//equalsIgnoreCase -->means any case upper or lower it will consider.

public class AuthenticationDemo {
	public static void main(String[] args) {
		Predicate<User> p = u -> u.userName.equals("Srikanth") && u.password.equals("Srigmk@28");
//		Predicate<User> p = u -> u.userName.equalsIgnoreCase("Srikanth") && u.password.equalsIgnoreCase("Srigmk@28");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Name!!");
		String userName = sc.nextLine();
		System.out.println("Enter the password!!");
		String password = sc.nextLine();

		User user = new User(userName, password);
		if (p.test(user)) {
			System.out.println("Valid user Welcome to Java!!");
		} else {
			System.out.println("Sorry Incorrect login details try again !!");
		}
	}

}
