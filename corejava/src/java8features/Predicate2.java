package java8features;

import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String[] args) {

		Predicate<Integer> p = (Integer n)-> n > 18;
		System.out.println("your age is :" + p.test(19));

	}
}
