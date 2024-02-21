package DateAndTimeApi;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeFormatterChronoFiledDemo {
	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z Z");
		System.out.println(df.format(zdt));
		
		//chronoFiled
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println(ldt1.get(ChronoField.DAY_OF_WEEK));
		System.out.println(ldt1.get(ChronoField.CLOCK_HOUR_OF_AMPM));
		System.out.println(ldt1.get(ChronoField.DAY_OF_MONTH));
		System.out.println(ldt1.get(ChronoField.DAY_OF_YEAR));
		
	}
}
