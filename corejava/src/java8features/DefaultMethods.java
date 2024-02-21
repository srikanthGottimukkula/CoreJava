package java8features;

interface Callable {
	void call(); // abstract method

	default void print() { // default method
		System.out.println("Print default method interface!!");
	}
}

class Phone implements Callable {

	@Override // implements abstract method
	public void call() {
		System.out.println("phone method is calling!!");
	}

}

public class DefaultMethods extends Phone {

	public static void main(String[] args) {
		Phone p = new Phone(); // creating object
		p.call(); // calling abstract method
		p.print(); // calling default method

	}

}
