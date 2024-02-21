package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//map -> for every element, filter means boolean value.
public class FilterStream {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(5);
		l.add(4);
		l.add(9);
		l.add(6);

		// Without Streams
		List<Integer> list = new ArrayList<Integer>();
		for (int i : l) {
			if (i % 2 == 0) {
				list.add(i);
				System.out.println("Without Streams:" + i);
			}
		}

		// with Streams
		List<Integer> i = l.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println("The Even numbers by using streams are : " + i);

	}
}
