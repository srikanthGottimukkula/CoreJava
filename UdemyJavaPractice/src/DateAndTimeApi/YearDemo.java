package DateAndTimeApi;


import java.time.Year;
import java.util.Scanner;

public class YearDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year number");
		int n = sc.nextInt();

		Year y = Year.of(n);
		if (y.isLeap()) {
			System.out.println(y+" year is leap year !! ");
		} else {
			System.out.println(y+" is not leap year !!");
		}

	}
}
