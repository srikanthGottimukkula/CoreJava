package java8features;

@FunctionalInterface
interface Addable {
	int add();
}

public class FunctionalinterFaceDemo {

	public static void main(String[] args) {
		Addable ad = new Addable() {

			@Override
			public int add() {
				int a = 20;
				int b = 10;
				return a + b;
			}
		};
		System.out.println("addition of two numbers:" + ad.add());

	}

}
