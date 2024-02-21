package twoArgFI;

import java.util.function.BiFunction;

//BiFunction: product of two numbers using BiFunction
public class BiFunProdTwoNubs {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bf = (a, b) -> (a * b);
		System.out.println(bf.apply(2, 4));

	}

}
