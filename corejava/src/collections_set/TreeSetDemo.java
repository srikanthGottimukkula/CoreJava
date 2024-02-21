package collections_set;

import java.util.*;

import collections_list.Employee;

public class TreeSetDemo {

	public static void main(String[] args) {

		// TreeSet by using set
		Set<Student> std = new TreeSet<Student>();

		// add the elements
		std.add(new Student(16, "jhon", 20000));
		std.add(new Student(12, "srikanth", 23098));
		std.add(new Student(13, "abhiram", 10000));
		std.add(new Student(14, "ramesh", 90000));
		std.add(new Student(15, "suresh", 30000));
		std.add(new Student(16, "jhon", 20000));

		// for each loop

		for (Student student : std) {
			System.out.println(student);
		}

	}

}
