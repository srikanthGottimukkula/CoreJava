package streams;

import java.util.List;
import java.util.stream.*;

//normal 

public class ParallelStreamDemo {

	public static void main(String[] args) {
		List<Student> student = StudentDataBase.getStudents();

		long start = 0;
		long end = 0;

//		start = System.currentTimeMillis();
//		IntStream.range(1, 100).forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("The normal Plain Stream is:" + (end - start));
//		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//
//		start = System.currentTimeMillis();
//		IntStream.range(1, 100).parallel().forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("The Parallel Stream is:" + (end - start));
//
//		IntStream.range(1, 100).forEach(x -> {
//			System.out.println("Thread:" + Thread.currentThread().getName() + ":" + x);
//		});
//
//		IntStream.range(1, 100).parallel().forEach(x -> {
//			System.out.println("Thread:" + Thread.currentThread().getName() + ":" + x);
//		});

		// Real Time Example

		start = System.currentTimeMillis();
		double doubleAvgFee = student.stream().map(Student::getFee).mapToDouble(i -> i).average().getAsDouble();
		System.out.println(doubleAvgFee);
		end = System.currentTimeMillis();
		System.out.println("The Normal stream :" + (end - start));

		start = System.currentTimeMillis();
		double parallelStreamAvgFee = student.stream().parallel().map(Student::getFee).mapToDouble(i -> i).average()
				.getAsDouble();
		System.out.println(parallelStreamAvgFee);
		end = System.currentTimeMillis();
		System.out.println("The Normal stream :" + (end - start));

	}

}
