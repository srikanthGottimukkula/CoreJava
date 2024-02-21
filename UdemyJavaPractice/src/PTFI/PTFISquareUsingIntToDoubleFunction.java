package PTFI;

import java.util.function.IntToDoubleFunction;

//program: find square root of given integer by using IntToDoubleFunction.
//IntToDoubleFunction takes input value int type and return type is double.
public class PTFISquareUsingIntToDoubleFunction {
	public static void main(String[] args) {

		IntToDoubleFunction f = i -> Math.sqrt(i);
		System.out.println(f.applyAsDouble(2));

	}
}
