package streams;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.*;

public class EkartDataBase {

	public static List<Customers> getAll() {
		return Stream.of(

				new Customers(101, "john", "jhon@gmail.com", Arrays.asList("9502900547", "772690394")),
				new Customers(102, "john", "jhon1@gmail.com", Arrays.asList("453427", "7726904")),
				new Customers(103, "john", "jhon2@gmail.com", Arrays.asList("95029047", "7726994")),
				new Customers(104, "john", "jhon4@gmail.com", Arrays.asList("95020547", "770394")),
				new Customers(108, "john", "jhon28@gmail.com", Arrays.asList("900547", "70394"))

		).collect(Collectors.toList());

	}

}
