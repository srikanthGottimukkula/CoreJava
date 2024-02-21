package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//sorted()->ascending order, for customized order go for comparator method.
public class DemoStreams {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(8);
		l.add(5);
		l.add(7);
		l.add(2);

		System.out.println("Before nature :" + l);

		List<Integer> ao = l.stream().sorted().collect(Collectors.toList()); // ascending order
		System.out.println("ascending order: " + ao);

		List<Integer> dso = l.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList()); // descending order																									// order
		System.out.println("descending order:" + dso);

	}
}
