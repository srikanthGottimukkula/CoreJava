package streams;

import java.util.ArrayList;

public class DemoMinAndMax {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(9);
		l.add(4);
		l.add(1);
		l.add(10);
		System.out.println("Before nature is:" + l);

		// minimum  value
		Integer min = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("The minimum value is :" + min);
		
		//Maximum value 
		Integer max= l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("The maximum value is :" + max);
		

	}
}
