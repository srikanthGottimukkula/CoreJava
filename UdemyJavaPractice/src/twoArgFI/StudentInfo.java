package twoArgFI;

import java.util.ArrayList;
import java.util.function.BiFunction;

//program:- To create student object by taking name and rollno as input by using bifunction.

class Student {
	String name;
	int rollno;

	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

}

public class StudentInfo {
	public static void main(String[] args) {

		ArrayList<Student> l = new ArrayList<>();

		BiFunction<String, Integer, Student> bf = (name, rollno) -> new Student(name, rollno);

		l.add(bf.apply("Srikanth", 01));
		l.add(bf.apply("SriRam", 11));
		l.add(bf.apply("SriSai", 41));
		l.add(bf.apply("SriShanth", 31));
		l.add(bf.apply("Karthik", 23));

		for (Student std : l) {

			System.out.println("The student name is:" + std.name);
			System.out.println("The student rollno is:" + std.rollno);
			System.out.println();

		}

	}
}
