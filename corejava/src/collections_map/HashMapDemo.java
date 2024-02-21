package collections_map;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		// for adding the elements to map
		map.put(1, "srikanth");
		map.put(2, "abhiram");
		map.put(3, "srikrishna");
		map.put(4, "stevjobs");
		map.put(5, "elonmusk");

		// for particular value
		String s = map.get(1);
		System.out.println(s);
		
		//true or false weather that key is there or not
		System.out.println(map.containsKey(4));

		// for retrieve the all elements
		Set<Entry<Integer, String>> entries = map.entrySet();

		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry);
		}

	}

}
