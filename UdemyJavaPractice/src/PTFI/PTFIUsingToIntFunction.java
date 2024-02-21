package PTFI;

import java.util.function.ToIntFunction;

//program: Find the length of the given string by using ToIntFunction.
//ToIntFunction always taking input argument but return int type.

public class PTFIUsingToIntFunction {
	public static void main(String[] args) {
		ToIntFunction<String> f = s -> s.length();
		System.out.println(f.applyAsInt("Abhiram"));
	}
}
