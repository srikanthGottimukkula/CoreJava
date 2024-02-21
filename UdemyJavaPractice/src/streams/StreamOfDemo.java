package streams;

import java.util.stream.Stream;

public class StreamOfDemo {
	public static void main(String[] args) {

		// group of values
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 7);
		s.forEach(System.out::println);

		// arrays
		Double[] d = { 10.1, 5.7, 9.0, 8.3, 7.5 };
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(System.out::println);

	}
}
