package DateAndTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DemoZoneId {

	public static void main(String[] args) {
		ZoneId d = ZoneId.systemDefault();
		System.out.println(d);

		ZoneId a = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(a);
		System.out.println(zt);

	}
}
