package function;

import java.util.function.Function;

//Difference between andThen and Compose in Functions most imp methods.
public class DiffAndThenAndCompose {
	public static void main(String[] args) {

		Function<Integer, Integer> f1 = i -> i + i;
		Function<Integer, Integer> f2 = i -> i * i * i;

		System.out.println("The andThen Function Result:" + f1.andThen(f2).apply(2));
		System.out.println("The Compose Function Result:" + f1.compose(f2).apply(2));

	}
}
