package Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

//Predicate Using collections

public class Demo3 {
	public static void main(String[] args) {
		Predicate<Collection> p = c -> c.isEmpty();
		ArrayList l1 = new ArrayList<>();
		l1.add("Srikanth");
		System.out.println(p.test(l1));

		ArrayList l2 = new ArrayList<>();
		System.out.println(p.test(l2));
	}

}
