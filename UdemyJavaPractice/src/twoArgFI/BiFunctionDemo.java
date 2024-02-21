package twoArgFI;

import java.util.function.BiFunction;

//to calculate monthly salary with employee and timesheet objects as input by using bifunction.
class Employee {

	int eno;
	String name;
	double dailyWage;

	public Employee(int eno, String name, double dailyWage) {
		super();
		this.eno = eno;
		this.name = name;
		this.dailyWage = dailyWage;
	}

}

class TimeSheet {

	int eno;
	int days;

	public TimeSheet(int eno, int days) {
		super();
		this.eno = eno;
		this.days = days;
	}

}

public class BiFunctionDemo {
	public static void main(String[] args) {

		BiFunction<Employee, TimeSheet, Double> bf = (e, t) -> e.dailyWage * t.days;
		Employee e = new Employee(1, "srikanth", 1200);
		TimeSheet t = new TimeSheet(1, 30);

		System.out.println(bf.apply(e, t));

	}
}
