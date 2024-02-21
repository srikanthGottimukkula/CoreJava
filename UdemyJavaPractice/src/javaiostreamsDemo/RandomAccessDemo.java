package javaiostreamsDemo;

import java.io.RandomAccessFile;

public class RandomAccessDemo {
	public static void main(String[] args) throws Exception {

		RandomAccessFile rf = new RandomAccessFile("C:/Users/Srikanth Gmk/OneDrive/Documents/Data.txt", "rw");

//		byte b[] = {'a','b','c','d','e','f','g','h','i','j'}

		System.out.println((char) rf.read());
		System.out.println((char) rf.read());
		System.out.println((char) rf.read());
		rf.write('D');
		System.out.println((char) rf.read());
		rf.skipBytes(2);
		System.out.println((char) rf.read());
		rf.seek(3);
		System.out.println((char) rf.read());
		System.out.println(rf.getFilePointer());
		rf.seek(rf.getFilePointer() + 2);
		System.out.println((char) rf.read());

	}
}
