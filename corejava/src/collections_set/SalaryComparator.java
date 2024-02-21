package collections_set;

import java.util.Comparator;

public class SalaryComparator  implements Comparator<Student> {

	@Override
	public int compare(Student std1, Student std2) {
		
		return (int)(std2.getSalary()-std1.getSalary()) ;
	}

}
