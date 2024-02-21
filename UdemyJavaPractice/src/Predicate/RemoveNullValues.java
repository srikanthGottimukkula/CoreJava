package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

//Remove all null values empty string and 0 values.

public class RemoveNullValues {
	public static void main(String[] args) {

		String[] names = { "Srikanth", null, " ", "SriRam", null, "" };

		Predicate<String> p = s -> s != null && s != " " && s.length()!= 0;
		ArrayList<String> list = new ArrayList<>();

		for (String name : names) {
			if (p.test(name)) {
//				System.out.println(name);
				list.add(name);
			}
		}
		System.out.println("Valid Information without spaces!!");
		System.out.println(list);

	}
}
