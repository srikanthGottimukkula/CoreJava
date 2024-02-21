package lambdaExpressions;

import java.util.*;
//import java.util.function.Supplier;

public class SupplierFunctionalInterface  {

	public static void main(String[] args) {
//		Supplier<String> supplier =()-> "Good Morning!!";
//		System.out.println(supplier.get());



	List<String> list1 = Arrays.asList();
	System.out.println(list1.stream().findAny().orElseGet(()-> "Good Morning!!"));
	
	}
}
