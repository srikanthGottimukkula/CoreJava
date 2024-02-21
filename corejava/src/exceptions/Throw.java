package exceptions;
//Throw :- The Java throw keyword is used to throw an exception explicitly.
public class Throw {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("person is not eligible for vote!!");
		}
		else 
		{
			System.out.println("person is eligible for vote!!");
		}
	}
public static void main(String[] args) {
	validate(17);
	System.out.println("Rest of the code!!");
}
}
