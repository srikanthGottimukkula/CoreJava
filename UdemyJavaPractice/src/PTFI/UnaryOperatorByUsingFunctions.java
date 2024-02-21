package PTFI;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

//Unary operator: if input and output as same type then use this operator.
//Primitive versions of unaryOperator.

public class UnaryOperatorByUsingFunctions {
	public static void main(String[] args) {
		UnaryOperator<Integer> u = i -> i * i;
		System.out.println(u.apply(5));
	}

}

//IntUnaryOperator, IntDoubleOperator and LongUnaryOprator.
class UnaryOperatorByUsingFunctionsPrimitiveVersion {
	public static void main(String[] args) {
		IntUnaryOperator u = i -> i * i;
		System.out.println(u.applyAsInt(4));
	}

}

//ApplyASINT square root number.
class UnaryOperatorByUsingFunctionsChaining {
	public static void main(String[] args) {
		IntUnaryOperator u1 = i -> i * i;
		System.out.println(u1.applyAsInt(1));
		IntUnaryOperator u2 = i -> i * i;
		System.out.println(u2.applyAsInt(2));
		System.out.println(u1.andThen(u2).applyAsInt(3));

	}

}
