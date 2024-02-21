package DateAndTimeApi;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yyyy = dt.getYear();
		System.out.printf("%d-%d-%d", dd, mm, yyyy);

		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int ns = dt.getNano();
		System.out.printf("\n%d:%d:%d:%d", h, m, s, ns);

	}
}
