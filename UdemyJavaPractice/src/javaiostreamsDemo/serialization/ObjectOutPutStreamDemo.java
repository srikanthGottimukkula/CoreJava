package javaiostreamsDemo.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student2 implements Serializable {

	private int rollno;
	private String name;
	private float avg;
	private String dept;
	private static int Data = 10;
	public transient int t;

	public Student2() {
		super();
	}

	public Student2(int rollno, String name, float avg, String dept) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.avg = avg;
		this.dept = dept;
		Data=100;
		t=10;
	}

}

public class ObjectOutPutStreamDemo  {
	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("C:/Users/Srikanth Gmk/OneDrive/Documents/std2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student2 std = new Student2(10, "jhon", 24.2f, "eee");
		oos.writeObject(oos);
		fos.close();
		oos.close();

	}
}
