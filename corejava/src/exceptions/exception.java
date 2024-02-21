package exceptions;

import java.util.Scanner;
//The modulo (%) operator gives the remainder while the division (/) operator gives the quotient

public class exception {

	public static void divide(int num, int den) {
		int result = num % den;
		System.out.println("The results are :" + result);
	}

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator!!");
		int nu = sc.nextInt();
		System.out.println("Enter the denominator!!");
		int de = sc.nextInt();
		divide(nu,de);
		}

		catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
