package twoArgFI;

import java.util.ArrayList;
import java.util.function.BiConsumer;

//Demo program to increment employee salary by using BiConsumer.
class EmployeeDemo{

	String name;
	double salary;

	public EmployeeDemo(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class BiConsumerEmpSalary {
	public static void main(String[] args) {
		ArrayList<EmployeeDemo> l = new ArrayList<EmployeeDemo>();
		populate(l);

		BiConsumer<EmployeeDemo, Double> bc = (e, increment) -> e.salary = e.salary + increment;

		for (EmployeeDemo e : l) {
			bc.accept(e, 500.0);
			System.out.println("The EmployeeDemo name is :" + e.name);
			System.out.println("The EmployeeDemo salary is: " + e.salary);
			System.out.println();
		}

	}

	public static void populate(ArrayList<EmployeeDemo> l) {
		l.add(new EmployeeDemo("Srikanth", 1000));
		l.add(new EmployeeDemo("Abhiram", 2000));
		l.add(new EmployeeDemo("SriRam", 3000));
		l.add(new EmployeeDemo("Karthik", 4000));
		l.add(new EmployeeDemo("Shayam", 5000));
	}
}
