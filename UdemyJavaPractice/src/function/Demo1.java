package function;

import java.util.function.Function;

public class Demo1 {
	public static void main(String[] args) {

		// Find the no of characters of the given string
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Srikanth"));

		//multiplication 
		Function<Integer, Integer> f1 = i -> i * i;
		System.out.println(f1.apply(4));

		//remove the spaces given string 
		String s = "Srikanth from warangal ";
		Function<String,String> f3 = s1->s1.replaceAll(" ", "");
		System.out.println(f3.apply(s));
		
		//how many spaces count values
		Function<String, Integer> f4 = s2->s2.length()-s2.replaceAll(" ", "").length();
		System.out.println(f4.apply(s));
	}
}
