package collections_list;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<Employee>();

		// add is the method to add the elements in the collection
		emps.add(new Employee(12, "srikanth", 23098.9));
		emps.add(new Employee(13, "abhiram", 10000.0));
		emps.add(new Employee(14, "ramesh", 90000.0));
		emps.add(new Employee(15, "suresh", 30000.0));
		emps.add(new Employee(16, "jhon", 20000.0));

		// how many elements in the collections
		System.out.println("totalnumber of elements:" + emps.size());

		// remove
//		emps.remove(0);

		// print list
		// System.out.println("List of Elements");
		// System.out.println(emps);

		// for each
		// for (Employee employee : emps) {
		// System.out.println(employee);
		// }

		// iterating loop
		System.out.println("Before remove operation!!");
		Iterator<Employee> itr = emps.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// remove
		Iterator<Employee> itr1 = emps.iterator();
		while (itr1.hasNext()) {
			if (itr1.next().getName().equals("suresh")) {
				itr1.remove();
			}
			;
		}

		System.out.println("after remove operation!!");
		Iterator<Employee> itr2 = emps.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
