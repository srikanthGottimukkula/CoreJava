package java8features;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

public class MethodRef {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 5, 6, 7, 8);

//		Consumer<Integer> c = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//
//		};
//		Consumer<Integer> c = (Integer t) -> System.out.println(t);
		
//		list.forEach(t -> System.out.println(t));
		list.forEach(System.out::println);  //methodRef left side is object right side is method name

	}

}
