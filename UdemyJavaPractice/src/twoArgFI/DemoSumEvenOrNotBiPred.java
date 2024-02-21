package twoArgFI;

import java.util.function.BiPredicate;

//The sum of two numbers are even or not. using BiPredicate
public class DemoSumEvenOrNotBiPred {
	public static void main(String[] args) {

		BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;
		System.out.println(p.test(10, 3));
		System.out.println(p.test(10, 2));

	}
}
