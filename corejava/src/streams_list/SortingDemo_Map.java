package streams_list;

import java.util.*;

public class SortingDemo_Map {

	public static void main(String[] args) {
		// normal way
//	Map<Employee,Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			
//			return (int) (o1.getSalary()-o2.getSalary());
//		}
//	}) ;
		// by using lambda expressions

		Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
		employeeMap.put(new Employee(1, "srikanth", "IT", 2000), 12);
		employeeMap.put(new Employee(2, "srikrishna", "CSE", 6000), 17);
		employeeMap.put(new Employee(3, "Abhiram", "CSI", 5000), 18);
		employeeMap.put(new Employee(4, "joker", "EDE", 9000), 1);
		employeeMap.put(new Employee(5, "Jhon", "XYS", 1000), 4);

		// NORMAL WAY
//		System.out.println(employeeMap);

		// by using lambda expressions
//		System.out.println(employeeMap);

		// By using streams - ascending order salary
		employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		// descending order salary
		employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
				.forEach(System.out::println);

	}

}
