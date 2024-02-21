package collections_set;

import java.lang.Comparable;
import java.util.Objects;

//comparable using compareTo method
public class Student implements Comparable<Student> {

	public double getSalary() {
		return salary;
	}


	private int stdId;
	private String name;
	private double salary;

	public Student(int stdId, String name, double salary) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.salary = salary;
	}

	public Student() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary, stdId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary) && stdId == other.stdId;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	
	//only primitive type we can apply below code
	@Override
	public int compareTo(Student std) {
		if (this.stdId > std.stdId)
			return 1;
		else if (this.stdId < std.stdId)
			return -1;
		else
			return 0;
	}
	
	//non-primitive type ex;-String 
//	public int compareTo(Student std) {
//		return this.name.compareTo(std.name);
//		
//	}
	//*******************AT A TIME TWO OR MULTIPLE COMPARISION IS NOT POSSIBLE***************//

}
