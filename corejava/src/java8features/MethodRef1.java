package java8features;

//MethodRef by using static 
//MethodRef by using non-static

@FunctionalInterface
interface Sayable {
	void say();
}

public class MethodRef1 {
	public static void saySomething() { // static method
		System.out.println("hello say something static method!!");
	}

	public void saySomething1() { // static method
		System.out.println("hello say something non-static method!!");
	}

	public static void main(String[] args) {
		Sayable s = MethodRef1::saySomething; // static type methodRef
		s.say();

		Sayable s1 = new MethodRef1()::saySomething1; // non-static methodRef
		s1.say();

	}
}
