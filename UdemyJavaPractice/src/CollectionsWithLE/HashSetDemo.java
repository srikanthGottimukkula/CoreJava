package CollectionsWithLE;

import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<Integer>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		t.add(1);
		t.add(8);
		t.add(2);
		t.add(1);
		t.add(10);
		System.out.println(t);
	}
}
