package streams;

import java.util.ArrayList;

//to array method in streams
public class ToArrayDemo {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(9);
		l.add(5);
		l.add(2);

		Integer[] array = l.stream().toArray(Integer[]::new);
		for (Integer x : array) {
			System.out.println(x);
		}

	}
}
