package exceptions;
//multiple catch blocks
public class multipleCatch {

	public static void main(String[] args) {
		try {
//			int a[]= new int[5];
//			a[5]=30/0;
			String s= null;
			System.out.println(s.length());
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("This is a ArrayIndexOutOfBoundsException!!");
		}
		catch(ArithmeticException e) {
			System.out.println("arithemetic Exception !!");
		}
		catch(Exception e) {
			System.out.println("Exception occured!!");
		}
		System.out.println("Rest of the code!!");

	}

}
