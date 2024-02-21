package java8features;

interface Callable1 {
	static void display() {
		System.out.println("this is static display method inside interfcae!!");
	}
}

class Phone1 implements Callable1 {

	void run() {
		System.out.println("phone run method!!");
	}
}

public class StaticMethod {

	public static void main(String[] args) {

		Phone1 p = new Phone1();
		Callable1.display(); // static method calling
		p.run(); // non-static method calling

	}

}
