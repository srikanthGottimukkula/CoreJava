package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreams {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println("Without doing any operation:" + list);

		// before Streams
		List<Integer> l1 = new ArrayList<Integer>();
		for (int x : list) {
			System.out.println("Before Streams :" + (x * x));
		}

		//After Streams
		List<Integer> l = list.stream().map(m -> m * m).collect(Collectors.toList());
		System.out.println("Applying the Streams concept map function :" + l);

	}
}
