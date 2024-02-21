package Predicate;

import java.util.function.Predicate;

//Predicate Function string length

public class Demo2 {
	public static void main(String[] args) {
		Predicate<String> p = s -> s.length() > 5;
		System.out.println(p.test("Srikanth_gmk"));
	}
}
