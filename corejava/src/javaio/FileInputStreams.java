package javaio;

import java.io.*;

public class FileInputStreams {

	public static void main(String[] args) throws IOException {

		try {
			FileInputStream fis = new FileInputStream("C://Users//Srikanth Gmk//OneDrive//Documents//Test.txt");
			byte b[] = new byte[fis.available()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);

		}
//		try {
//			FileInputStream fis = new FileInputStream("C://Users//Srikanth Gmk//OneDrive//Documents//Test.txt");
//			{
//			int x ;
//			
//			do {
//				x=fis.read();
//				System.out.print((char)x);
//			}while(x!=-1);
//		}
//			{
//			int y;
//			while((y=fis.read())!=-1)
//			{
//				System.out.print((char)y);
//			}
//			}
//		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
