package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//count(), map(),filter(),collect()
public class FilterStreamDemo1 {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("srikanth");
		s.add("nagarjuna");
		s.add("chiranjeevi");
		s.add("balaKrishna");
		s.add("venkatesh");

		System.out.println(s);
		// without Streams
		List<String> list = new ArrayList<String>();
		for (String l : s) {
			if (l.length() >= 9) {
				System.out.println("The Strings >9 :" + l);
			}
		}

		// with streams
		List<String> sl = s.stream().filter(l -> l.length() >= 9).collect(Collectors.toList());
		System.out.println("The length is > 9 strings are :" + sl);

		// upper case
		List<String> s1 = s.stream().map(u -> u.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);

		// count method
		Long s2 = s.stream().map(u -> u.length()).count();
		System.out.println("The number of the strings are:" + s2);

	}

}
