package java8features;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
	
			int i =5;
			
			Predicate<Integer> p = (Integer num)-> num%2==0;
			System.out.println(p.test(i));

	}

}
