package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenerics {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sri krishna");
		list.add("Srikanth");
		list.add("sri rama");
		list.add("abhiram");
		list.add("karthik");
		
		//iterator by looping fetching data
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//for each by fetching data
//		for (String string : list) {
//			System.out.println(string);
//		}
//		
		
		

	}

}
