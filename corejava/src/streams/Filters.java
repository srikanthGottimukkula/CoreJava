package streams;

import java.util.*;

public class Filters {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("srikanth");
		list.add("abhiram");
		list.add("srikrishna");
		list.add("stevjobs");

		// normal way
//		 for (String st : list) {
//			if(st.startsWith("sr")) {
//				System.out.println(st);
//			}
//		}

		// streams using filer method
		list.stream().filter(t -> t.startsWith("a")).forEach(t -> System.out.println(t));

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "blue");
		map.put(2, "red");
		map.put(3, "green");
		map.put(4, "white");
		map.put(5, "block");

		map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(t -> System.out.println(t));

	}

}
