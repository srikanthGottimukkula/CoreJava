package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	String name;
	String designation;
	String city;
	double salary;

	public Employee(String name, String designation, String city, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", city=" + city + ", salary=" + salary
				+ "]";
	}

}

public class EmployeeManagementApp {
	public static void main(String[] args) {

//		ArrayList<Employee> list = new ArrayList<Employee>();
//		Employee e = new Employee("Srikanth","Developer","Warangal",20000);
//		list.add(e);
//		System.out.println(list);
		ArrayList<Employee> list1 = new ArrayList<Employee>();
		populate(list1);
//		System.out.println(list);

		Predicate<Employee> p1 = emp -> emp.designation == "Manager";
		System.out.println("Managers Information!!");
		display(p1, list1);
		
		System.out.println(" 										"); 
		System.out.println("**************************************");
		Predicate<Employee> p2 = emp -> emp.city == "Hyderabad";
		System.out.println("Employee who are in which location Information!!");
		display(p2, list1);
		
		System.out.println(" 										"); 
		System.out.println("**************************************");
		Predicate<Employee> p3 = emp->emp.salary>20000;
		System.out.println("Employees Who's salary is >20000");
		display(p3, list1);
		
		//PredicateJoining at a time two predicates joining
		System.out.println(" 										"); 	
		System.out.println("***************************************");
		System.out.println("who are in managers and hyderabad location those are terminated!!");
		display(p1.and(p2),list1);
		
		System.out.println(" 										"); 	
		System.out.println("***************************************");
		System.out.println("who are in managers and salary>20000 those are terminated!!");
		display(p1.or(p3),list1);
		
		System.out.println(" 										"); 	
		System.out.println("***************************************");
		System.out.println("List of non-managers information !!");
		display(p1.negate(),list1);
		

	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Srikanth", "Developer", "Warangal", 20000));
		list.add(new Employee("Srikrishna", "Testing", "Madhura", 30000));
		list.add(new Employee("SriRam", "Manager", "Bhadrachalam", 40000));
		list.add(new Employee("Abhiram", "CEO", "Hyderabad", 17000));
		list.add(new Employee("Karthik", "Manager", "Hyderabad", 50000));

	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee em : list) {
			if (p.test(em)) {
				System.out.println(em);
			}

		}

	}

}
