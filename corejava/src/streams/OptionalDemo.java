package streams;

import java.util.*;

//optional deals with null pointer exceptions

public class OptionalDemo {

	public static void main(String[] args) {

		Customers customer = new Customers(101, "jhon", "srikanth@gmail.com", Arrays.asList("567893", "8766543"));

		// empty
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

		// of
//		Optional<String> emptyOptional1 = Optional.of(customer.getEmail());
//		System.out.println(emptyOptional1);

		// ofNullable
		Optional<String> emptyOptional2 = Optional.ofNullable(customer.getEmail());
//		System.out.println(emptyOptional2);

		if (emptyOptional2.isPresent()) {
			System.out.println(emptyOptional2);
		}

		// orElse-default return type
		System.out.println(emptyOptional2.orElse("default message!!"));
		// orElseThrow throw our own exception
		System.out.println(emptyOptional2.orElseThrow(() -> new IllegalArgumentException("Email not present!!")));
		// orElseGet and map getting upper case string
		System.out.println(emptyOptional2.map(String::toUpperCase).orElseGet(() -> "default email!!"));

	}
}
