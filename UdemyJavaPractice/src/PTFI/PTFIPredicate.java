package PTFI;

import java.util.function.IntPredicate;

//Program: Find the even numbers using IntPredicate.
//IntPredicate always accepts input value of the int type.
public class PTFIPredicate {

	public static void main(String[] args) {
		int[] x = { 0, 5, 10, 15, 20, 25, 30 };
		IntPredicate p = i -> (i % 2 == 0);
		for (int x1 : x) {
			if (p.test(x1)) {
				System.out.println(x1);
			}
		}

	}

}
