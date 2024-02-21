package lambdaExpressions;

import java.util.*;

import java.util.stream.Collectors;

import streams.Employee;
import streams.EmployeeDAO;

public class StudentService {

	public static List<Employee> taxUsers(String str) {

		return (str.equalsIgnoreCase("tax"))
				? EmployeeDAO.getEmployees().stream().filter(std -> std.getSalary() > 500).collect(Collectors.toList())
				: EmployeeDAO.getEmployees().stream().filter(std -> std.getSalary() <= 500)
						.collect(Collectors.toList());

	}

//	return (str.equalsIgnoreCase("tax"))? EmployeeDAO.getEmployees().stream().filter(emp->emp.getSalary()>500)
//			.collect(Collectors.toList()):
//				EmployeeDAO.getEmployees().stream().filter(emp->emp.getSalary()<=500)
//			.collect(Collectors.toList());
//	
//}

	public static void main(String[] args) {
		System.out.println(taxUsers("non tax"));

	}

}
