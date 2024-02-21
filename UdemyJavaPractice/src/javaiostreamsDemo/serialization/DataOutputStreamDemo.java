package javaiostreamsDemo.serialization;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

class Student1 {
	int s_rollno;
	String std_name;
	String std_dept;
}

public class DataOutputStreamDemo {
	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("C://Users//Srikanth Gmk//OneDrive//Documents//Demo.txt");
		DataOutputStream dos = new DataOutputStream(fos);

		Student1 s = new Student1();
		s.s_rollno = 10;
		s.std_name = "srikanth";
		s.std_dept = "eee";

		dos.writeInt(s.s_rollno);
		dos.writeUTF(s.std_name);
		dos.writeUTF(s.std_dept);

		dos.close();
		fos.close();

	}
}
