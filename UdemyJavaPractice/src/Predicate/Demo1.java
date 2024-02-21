package Predicate;

import java.util.function.Predicate;

//Predicate function using number greater than 10 or not.

public class Demo1 {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(11)); //true
		System.out.println(p.test(9));  //false
	}
}
