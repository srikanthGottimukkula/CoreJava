package DateAndTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
	public static void main(String[] args) {

		LocalDate birthday = LocalDate.of(1998, 10, 16);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);

		System.out.printf("Age %d years %d months %d days", p.getYears(), p.getMonths(), p.getDays());

		LocalDate deathday = LocalDate.of(1998 + 60, 10, 16);
		Period p1 = Period.between(today, deathday);
		int d = p1.getYears() * 365 + p1.getMonths() * 30 + p1.getDays();
		System.out.printf("\n you will be on th earth %d days.....", d);
	}
}
