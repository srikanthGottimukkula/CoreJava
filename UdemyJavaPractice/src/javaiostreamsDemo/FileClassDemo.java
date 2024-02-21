package javaiostreamsDemo;

import java.io.File;
import java.io.FileOutputStream;

public class FileClassDemo {
	public static void main(String[] args) throws Exception {

		File f = new File("C:/Users/Srikanth Gmk/OneDrive/Documents");
		System.out.println(f.isDirectory());

//		String list[] = f.list();
//		for (String x : list) {
//			System.out.println(x);
//		}
		
//		File list[] = f.listFiles();
//		for(File x: list) {
//			System.out.println(x.getName());
//			System.out.println(x.getPath());
//			System.out.println(x.getParent());
//		}
		FileOutputStream fis = new FileOutputStream("C:/Users/Srikanth Gmk/OneDrive/Documents/Data.txt");
//		f.setWritable(true);
		f.setReadOnly();

	}
}
