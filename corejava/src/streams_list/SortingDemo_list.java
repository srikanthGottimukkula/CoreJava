package streams_list;

import java.util.*;

public class SortingDemo_list {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeDAO.getEmployees();

		// normal way

//		Collections.sort(employees, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return (int) (o1.getSalary() - o2.getSalary());
//			}
//		});

//		System.out.println(employees);

		// by using lambada expressions

//		Collections.sort(employees,(o1, o2) ->	(int) (o1.getSalary() - o2.getSalary()));
//		System.out.println(employees);

		// By using streams
//		employees.stream().sorted((o1, o2) ->	(int) (o1.getSalary() - o2.getSalary())).forEach(emp->System.out.println(emp));
		// method reference
//		employees.stream().sorted((o1, o2) ->	(int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);

		// comparators
//		employees.stream().sorted(Comparator.comparing(emp -> emp.getName())).forEach(System.out::println);

		// methodReference
		employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);

	}

}
