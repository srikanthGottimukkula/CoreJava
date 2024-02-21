package CollectionsWithLE;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLEDemo {
	
	public static void main(String[] args) {
		

	ArrayList<Integer> l  = new ArrayList<Integer>();
	l.add(4);
	l.add(5);
	l.add(2);
	l.add(1);
	System.out.println("Before Sorting!!");
	System.out.println(l);
	Collections.sort(l,(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
	System.out.println("After Sorting!!");
	System.out.println(l);
	}	

}
