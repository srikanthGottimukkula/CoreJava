package streams;

import java.util.*;

public class StudentDataBase {

	public static List<Student> getStudents() {
		List<Student> student = new ArrayList<>();

		for (int i = 1; i < 25; i++) {
			student.add(new Student("srikanth", "228AZ", "Warangal", Double.valueOf(new Random().nextInt(1000 * 100))));
		}

		return student;

	}

}
