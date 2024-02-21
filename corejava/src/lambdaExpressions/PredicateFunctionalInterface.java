package lambdaExpressions;

import java.util.Arrays;
import java.util.*;
//import java.util.function.Predicate;

public class PredicateFunctionalInterface {

	public static void main(String[] args) {
//		Predicate<Integer> predicate = t -> t % 2 == 0;
//				System.out.println(predicate.test(7));			
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		list1.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print even:" + t));
		
	}

}
