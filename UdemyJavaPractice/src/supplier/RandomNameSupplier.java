package supplier;

import java.util.function.Supplier;

public class RandomNameSupplier {
	public static void main(String[] args) {

		Supplier<String> ss = () -> {

			String[] s1 = { "Srikanth", "Abhiram", "Pradeep", "Shekar" };
			int x = (int) (Math.random()*4);
			return s1[x];

		};
		System.out.println(ss.get());
		System.out.println(ss.get());
		System.out.println(ss.get());
		System.out.println(ss.get());

	}
}
