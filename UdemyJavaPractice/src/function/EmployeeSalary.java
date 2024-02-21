package function;

import java.util.ArrayList;
import java.util.function.Function;

//how to find the total monthly salary
class Employee1 {

	String name;
	double salary;

	public Employee1(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}

public class EmployeeSalary {

	public static void main(String[] args) {

		ArrayList<Employee1> list = new ArrayList<Employee1>();
		populate(list);

		Function<ArrayList<Employee1>, Double> f = emp -> {

			double total = 0;
			for (Employee1 em : list) {
				total = em.salary + total;
			}
			return total;
		};
		System.out.println("Total Employees salary of the month:" + f.apply(list));

	}

	public static void populate(ArrayList<Employee1> e) {
		e.add(new Employee1("srikanth", 1000));
		e.add(new Employee1("ram", 2000));
		e.add(new Employee1("sarath", 3000));
		e.add(new Employee1("bharath", 4000));
		e.add(new Employee1("karthik", 2000));

	}

}
