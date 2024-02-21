package function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee12 {

	String name;
	double salary;

	public Employee12(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee12 [name=" + name + ", salary=" + salary + "]";
	}

}

public class Example1 {
	public static void main(String[] args) {

		ArrayList<Employee12> list1 = new ArrayList<Employee12>();
		populate(list1);
		System.out.println("Before incrementation!1");
		System.out.println(list1);

		Predicate<Employee12> p = e -> e.salary < 3000;
		Function<Employee12, Employee12> f = e -> {
			e.salary = e.salary + 1000;
			return e;
		};
		System.out.println("After incrementation!!");
		ArrayList<Employee12> list2 = new ArrayList<Employee12>();
		for (Employee12 e : list1) {
			if (p.test(e)) {
				list2.add(f.apply(e));
			}
		}
		System.out.println(list1);
		System.out.println("incremented employees salarys!!");
		System.out.println(list2);

	}

	public static void populate(ArrayList<Employee12> e) {
		e.add(new Employee12("srikanth", 1000));
		e.add(new Employee12("ram", 2000));
		e.add(new Employee12("sarath", 3000));
		e.add(new Employee12("bharath", 4000));
		e.add(new Employee12("karthik", 2000));

	}
}
