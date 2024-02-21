package streams;

import java.util.*;
import java.util.function.Consumer;

//for each internally using consumer functional interface accept(T t) method
public class ForEach {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("srikanth");
		list.add("abhiram");
		list.add("srikrishna");
		list.add("stevjobs");

		// normal way
//		 for (String string : list) {
//			System.out.println(string);
//		}

		// forEach method streams

		list.stream().forEach(t -> System.out.println(t)); // by using streams

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "blue");
		map.put(2, "red");
		map.put(3, "green");
		map.put(4, "white");
		map.put(5, "block");

//		map.forEach((key,value)->System.out.println(key+":"+value));  //normal way

		map.entrySet().stream().forEach(t -> System.out.println(t)); // streams

		// internally operation

		Consumer<String> consumer = (t) -> System.out.println(t);
		for (String string : list) {
			consumer.accept(string);
		}
	}

}