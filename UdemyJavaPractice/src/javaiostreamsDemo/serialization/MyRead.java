package javaiostreamsDemo.serialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MyRead {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Users/Srikanth Gmk/OneDrive/Documents/std.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		Student s = new Student();
		s.rollno = Integer.parseInt(br.readLine());
		s.name=br.readLine();
		s.dept=br.readLine();
		System.out.println(	"Std_rollno:"+s.rollno+" Std_Name:"+s.name+" std_dept:"+s.dept);
		br.close();
		fis.close();
	}
}
