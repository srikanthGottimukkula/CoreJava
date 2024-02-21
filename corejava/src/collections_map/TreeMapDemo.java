package collections_map;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "srikanth");
		map.put(2, "abhiram");
		map.put(3, "srikrishna");
		map.put(4, "stevjobs");
		map.put(5, "elonmusk");

		String s = map.get(3);
		System.out.println(s);

		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry);
		}

	}

}
