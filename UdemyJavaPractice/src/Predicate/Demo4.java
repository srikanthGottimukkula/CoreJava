package Predicate;

import java.util.function.Predicate;

//Program to display the name start with s letter by using predicate

public class Demo4 {
	public static void main(String[] args) {
		String[] names = { "Srikanth", "Karthik", "Swathi", "Bharath", "Mahesh", "Srikrishna" };

		Predicate<String> str1 = s -> s.charAt(0) == 'S';
		System.out.println("Program to display the name start with s letter by using predicate");
		for (String s : names) {
			if (str1.test(s)) {
				System.out.println(s);

			}
		}

	}

}
