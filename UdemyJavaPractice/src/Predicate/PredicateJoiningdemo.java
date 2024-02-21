package Predicate;

import java.util.function.Predicate;

public class PredicateJoiningdemo {
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6,7,8,9,10};
		
		Predicate<Integer> p1 = i->i>2;
		Predicate<Integer> p2 = i->i%2==0;
		System.out.println("Print the values greater than 2!!");
		m1(p1,x);
		System.out.println("Print the even values only");
		m1(p2,x);
		System.out.println("Both conditions valid");
		m1(p1.and(p2),x);
		System.out.println("Any one of the condition is true using or method");
		m1(p1.or(p2),x);
		System.out.println("using negate function");
		m1(p1.negate(),x);
	
	}
	
	public static void m1(Predicate<Integer> p, int[] x) {
		for(int i: x) {
			if(p.test(i)) {
				System.out.println(i); 	
			}
		}
	}
	
}
