
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

//String concatenation using BiFunction.
public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<String, String, String> s = (s1, s2) -> s1 + s2;
		System.out.println("Hello" + " world!!");

	}

	// Normal way of Binary operator.
	public class BiOperatorUsingBiFunction {

		public static void main(String[] args) {
			BinaryOperator<String> s = (s1, s2) -> s1 + s2;
			System.out.println("Hello" + " java!!");

		}
	}

	// Primitive Version of binary operator function

	public class BiOperatorPrimitiveVersionUsingBiFunction {

		public static void main(String[] args) {
			IntBinaryOperator s = (s1, s2) -> s1 + s2;
			System.out.println("Good" + " morning!!");

		}
	}

}
