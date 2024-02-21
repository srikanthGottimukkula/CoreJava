package streams_list;

import java.util.*;

public class Sorting_List {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(4);
		list.add(3);

		// normal way
//		Collections.sort(list); //ascending
//		Collections.reverse(list); //descending
//		System.out.println(list);

		// streams using sorting

		list.stream().sorted(Comparator.reverseOrder()).forEach(li -> System.out.println(li)); // ascending order
		list.stream().sorted().forEach(li -> System.out.println(li)); // descending order

	}

}
