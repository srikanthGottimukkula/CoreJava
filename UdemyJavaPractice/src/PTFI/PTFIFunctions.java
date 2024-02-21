package PTFI;

import java.util.function.Function;

//Demo program to find square of given integer by using Function.
public class PTFIFunctions {
	public static void main(String[] args) {

		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(5));

	}
}
