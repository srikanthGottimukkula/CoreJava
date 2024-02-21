package PTFI;


import java.util.function.IntFunction;

//Demo program to find square of given integer by using IntFunction.
public class PTFIFunctionsUsingIntFunction {
	public static void main(String[] args) {

		IntFunction<Integer> f = i -> i * i;
		System.out.println(f.apply(5));

	}
}
