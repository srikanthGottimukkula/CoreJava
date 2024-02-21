package PTFI;

import java.util.function.Function;

//program: find square root of given integer by using function.
public class PTFISquareUsingFunction {
	public static void main(String[] args) {

		Function<Integer, Double> f = i -> Math.sqrt(i);
		System.out.println(f.apply(2));

	}
}
