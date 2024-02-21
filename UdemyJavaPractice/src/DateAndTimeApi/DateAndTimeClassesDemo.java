package DateAndTimeApi;

import java.time.Instant;
import java.time.MonthDay;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTimeClassesDemo {
	public static void main(String[] args) {

		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(zdt);

		MonthDay md = MonthDay.now();
		System.out.println(md);

		Period p = Period.of(1, 1, 1);
		System.out.println(p.addTo(zdt));

		Instant i = Instant.now();
		System.out.println(i);

	}
}
