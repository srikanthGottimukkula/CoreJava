package function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

}

public class StudentGrade {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		populate(list);
		
		Predicate<Student> p = sp->sp.marks>35;

		Function<Student, String> f = std -> {

			int marks = std.marks;
			if (marks >= 90) {
				return "A - [dictinction]";
			} else if (marks >= 75) {
				return "B - [first-class]";
			} else if (marks >= 65) {
				return "C - [second class]";
			} else if (marks >= 35) {
				return "D-[just pass]";
			} else {
				return "failed";
			}
		};

		for (Student sd : list) {
			if(p.test(sd)) {
			System.out.println("Student name is: " + sd.name);
			System.out.println("Student marks is: " + sd.marks);
			System.out.println("Student grade  is: " + f.apply(sd));
		}
		}
	}

	public static void populate(ArrayList<Student> s) {
		s.add(new Student("Srikanth", 90));
		s.add(new Student("Abhiram", 75));
		s.add(new Student("Raju", 65));
		s.add(new Student("Ram", 35));
		s.add(new Student("karthik", 30));

	}
}
