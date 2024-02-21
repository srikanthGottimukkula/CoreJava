package CollectionsWithLE;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer, String>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		t.put(1, "java");
		t.put(2, "python");
		t.put(3, "Spring");
		t.put(4, "SpringBoot");
		System.out.println(t);
	}
}
