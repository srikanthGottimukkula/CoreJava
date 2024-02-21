package exceptions;

import java.util.Scanner;

//unchecked exception using throws keyword
class InvalidException extends Exception{
	
	private String message;

	public InvalidException(String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	
}

public class CustomException  {
	
	public static void validate(int age) throws InvalidException {
		if(age>18) {
			System.out.println("you are eligible for voting!!");
		}else {
			throw new InvalidException("invalid age exception!!");
		}
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the age!!");
			int age = sc.nextInt();
			validate(age);
		}catch(InvalidException e) {
			e.printStackTrace();
		}
		System.out.println("Rest code!!!");}

}
