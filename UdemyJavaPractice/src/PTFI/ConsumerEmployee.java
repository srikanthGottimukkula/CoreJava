package PTFI;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

//program : increment employee salary by using objDoubleConsumer

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class ConsumerEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		populate(l);

		ObjDoubleConsumer<Employee> c = (e, d) -> e.salary = e.salary + d;
		for (Employee e : l) {
			c.accept(e, 500.0);
		}
		for (Employee e : l) {
			System.out.println("The Employee Name is :" + e.name);
			System.out.println("The Employee Salary is: " + e.salary);
			System.out.println();
		}

	}

	public static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Srikanth", 1000));
		l.add(new Employee("Abhiram", 2000));
		l.add(new Employee("Karthik", 3000));
		l.add(new Employee("Naveen", 4000));
	}

}
