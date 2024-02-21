package lambdaExpressions;

import java.util.Arrays;
import java.util.*;
//import java.util.function.Consumer;

public class ConsumerFunctionalInterface {

	public static void main(String[] args) {
//		Consumer<Integer> consumer = t ->System.out.println(t);
//		consumer.accept(10);
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		list1.stream().forEach(t ->System.out.println(t));
	}



	

}
