package exceptions;

//Finally block -when exception is occur
public class Finally1 {

	public static void main(String[] args) {
		try {
			int a = 10 % 0;
			int a1[] = new int[5];
			System.out.println(a1[4]);
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException!!");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException!!");
		} catch (Exception e) {
			System.out.println("Exception occured parent class!!");
		} finally {
			System.out.println("finally block always executed!!");
		}
		System.out.println("Rest of the code!!");
	}
}
