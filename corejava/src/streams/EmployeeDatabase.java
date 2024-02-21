package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

	public static List<Employee1> getEmployees() {

		return Stream
				.of(new Employee1(101, "srikanth", "A", 60000), new Employee1(102, "abhiram", "A", 60000),
						new Employee1(103, "mahesh", "B", 50000), new Employee1(104, "suresh", "A", 90000),
						new Employee1(105, "karthik", "C", 40000), new Employee1(106, "pavan", "I", 20000))
				.collect(Collectors.toList());

	}

}
