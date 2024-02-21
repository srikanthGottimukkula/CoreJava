package DateAndTimeApi;

import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {

		LocalTime time = LocalTime.now();
		System.out.println("The current time is :"+time);
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int ns = time.getNano();
		System.out.printf("%d:%d:%d:%d",h,m,s,ns);
		
	}
}
