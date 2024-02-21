package javaiostreamsDemo.serialization;

import java.io.FileOutputStream;
import java.io.PrintStream;

class Student {
	int rollno;
	String name;
	String dept;
}

public class MyWrite {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Users/Srikanth Gmk/OneDrive/Documents/std.txt");
		PrintStream ps = new PrintStream(fos);
		Student s = new Student();
		s.rollno = 10;
		s.name = "srikanth";
		s.dept = "eee";

		ps.println(s.rollno);
		ps.println(s.name);
		ps.println(s.dept);

		ps.close();
		fos.close();
	}
}
