package exceptions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegualrExpress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string!!");
		String s = sc.nextLine();
		System.out.println("Enter the pattern string!!");
		String p = sc.nextLine();
		Pattern pin = Pattern.compile(p);
		Matcher matcher = pin.matcher(s);

		while (matcher.find()) {
			System.out.println(matcher.group() + "start index=" + matcher.start() + "end index=" + matcher.end());
		}
		String output = matcher.replaceAll("python");
		System.out.println(output);

	}

}
