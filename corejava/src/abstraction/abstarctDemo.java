package abstraction;

abstract class Demo {
	abstract void run();
}

class AbstractDemo extends Demo {
	void run() {
		System.out.println("app is running!!");
	}

	void sleep() {
		System.out.println("sleeping method!!");
	}
}

public class abstarctDemo {
	public static void main(String[] args) {
		AbstractDemo ad = new AbstractDemo();
		ad.run();

		Demo d = new AbstractDemo();
		AbstractDemo a = (AbstractDemo) d;
		a.sleep();

	}
}
