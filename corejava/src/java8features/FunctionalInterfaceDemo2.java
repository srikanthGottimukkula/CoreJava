package java8features;
//An Interface that contains exactly one abstract method is known as functional interface. 

@FunctionalInterface
interface Sample {

	void run(String str);
	
}

public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {
		Sample sm = new Sample() {

			@Override
			public void run(String str) {
				System.out.println(str);
			}

		};
		sm.run("example of functional interface!!");
	}

}
