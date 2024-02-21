package streams;

import java.util.*;
import java.util.stream.Collectors;

public class MapvsFlatMap {

	/**
	 * @param args MAP VS FLAT MAP
	 */
	
	public static void main(String[] args) {

		List<Customers> customers = EkartDataBase.getAll();

		// mapping:customer->customer.getEmails()
		// customer->customer.getEmail() one to one mapping
		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());

		System.out.println(emails);

		// customer->customer.getPhoneNumbers()-one to many mapping
		List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());

		System.out.println(phoneNumbers);

		List<String> phoneNumber = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());

		System.out.println(phoneNumber);

	}

}
