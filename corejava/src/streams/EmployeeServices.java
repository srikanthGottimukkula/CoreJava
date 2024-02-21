package streams;
import java.util.*;
import java.util.stream.Collectors;
public class EmployeeServices {
	
	public static  List<Employee> evaluateTaxUsers(String str){
		return (str.equalsIgnoreCase("tax"))? EmployeeDAO.getEmployees().stream().filter(emp->emp.getSalary()>500)
				.collect(Collectors.toList()):
					EmployeeDAO.getEmployees().stream().filter(emp->emp.getSalary()<=500)
				.collect(Collectors.toList());
		
	}

	public static void main(String[] args) {
		
	
		System.out.println(evaluateTaxUsers("non tax"));
	}

}
