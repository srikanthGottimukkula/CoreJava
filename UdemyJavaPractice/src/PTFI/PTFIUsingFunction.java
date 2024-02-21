package PTFI;

import java.util.function.Function;

//program: find the length of given string by using function
public class PTFIUsingFunction {
	public static void main(String[] args) {

		Function<String, Integer> f = s->s.length();
		System.out.println(f.apply("SrikanthGmk"));
		
		
	}
}
