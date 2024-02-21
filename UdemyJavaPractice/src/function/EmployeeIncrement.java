package function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {

	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}

public class EmployeeIncrement {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		populate(list);

		System.out.println("Before Incrementation!!");
		System.out.println(list);
		Predicate<Employee> p = e -> e.salary < 3000;
		Function<Employee, Employee> f = emp -> {
			emp.salary = emp.salary + 500;
			return emp;
		};
		System.out.println("After Incrementation!!");

		ArrayList<Employee> list2 = new ArrayList<Employee>();
		for (Employee l : list) {
			if (p.test(l)) {
				list2.add(f.apply(l));
			}
		}
		System.out.println(list);
		System.out.println("Employees with incremented salary:");
		System.out.println(list2);

	}

	public static void populate(ArrayList<Employee> e) {
		e.add(new Employee("srikanth", 1000));
		e.add(new Employee("ram", 2000));
		e.add(new Employee("sarath", 3000));
		e.add(new Employee("bharath", 4000));
		e.add(new Employee("karthik", 2000));

	}
}
