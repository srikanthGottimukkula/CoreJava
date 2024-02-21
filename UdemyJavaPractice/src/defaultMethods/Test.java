package defaultMethods;

interface Interf {

	default void m1() {
		System.out.println("Default Method!!");
	}
}

public class Test implements Interf {

	public void m1() {
		System.out.println("My Own Implementation!!");
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.m1();

	}
}
//after 1.8 v we can write n no.of default methods in interface with concrete methods.