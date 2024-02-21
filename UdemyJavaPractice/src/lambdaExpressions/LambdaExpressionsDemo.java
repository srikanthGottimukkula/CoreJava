package lambdaExpressions;

public class LambdaExpressionsDemo {
	public static void main(String[] args) {

		Interface1 i1 = () -> System.out.println("The lambda expressions demo!!");

		Interface2 i2 = (a, b) -> System.out.println("The sum of two numbers is: " + (a + b));

		Interface3 i3 = s -> System.out.println("The String Value is :" + s);

		Interface4 i4 = s -> System.out.println(s.length());

		i1.m1();
		i2.m2(2, 5);
		i3.m3("Srikanth");
		i4.m4("Hello Java World!!");

	}

}
