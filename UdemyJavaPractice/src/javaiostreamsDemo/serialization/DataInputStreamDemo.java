package javaiostreamsDemo.serialization;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C://Users//Srikanth Gmk//OneDrive//Documents//Demo.txt");
		DataInputStream dis = new DataInputStream(fis);

		Student1 s = new Student1();
		s.s_rollno = dis.readInt();
		s.std_name = dis.readUTF();
		s.std_dept = dis.readUTF();

		System.out.println("RollNo: " + s.s_rollno + " Std_Name: " + s.std_name + " Std_dept: " + s.std_dept);

		dis.close();
		fis.close();

	}
}
