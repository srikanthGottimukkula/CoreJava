package exceptions;

//Finally block -when exception does not occur
public class Finally {

	public static void main(String[] args) {
		try {
			int a = 10 % 5;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException!!");
		} catch (Exception e) {
			System.out.println("Exception occured parent class!!");
		} finally {
			System.out.println("finally block always executed!!");
		}
		System.out.println("Rest of the code!!");
	}

}
