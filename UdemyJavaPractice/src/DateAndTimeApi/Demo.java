package DateAndTimeApi;

import java.time.LocalDateTime;
import java.time.Month;

public class Demo {
	public static void main(String[] args) {
		LocalDateTime t = LocalDateTime.of(1998, Month.OCTOBER, 16, 12, 00);
		System.out.println("Before Six months :" + t.plusMonths(6));
		System.out.println("After Six months :" + t.minusMonths(6));
	}
}
