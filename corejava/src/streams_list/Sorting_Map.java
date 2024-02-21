package streams_list;

import java.util.*;
import java.util.Map.Entry;

public class Sorting_Map {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("three", 3);
		map.put("abhiram", 6);
		map.put("shyam", 10);
		map.put("redena", 2);

		// normal way

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		//by using normal way
//		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//
//				return o1.getKey().compareTo(o2.getKey());
//			}
//
//		});
		
		//by using lambda expressions
//		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//		for (Entry<String, Integer> entry : entries) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}

		//By using streams 
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
	}
}
