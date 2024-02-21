package generics;

class AverageCalci<T extends Number> {
	public double average(T... numbers) {
		double sum = 0;
		for (T t : numbers) {
			sum += t.doubleValue();
		}
		return sum / numbers.length;
	}
}

public class BoundedType {

	public static void main(String[] args) {
		AverageCalci<Integer> iobj = new AverageCalci<Integer>();
		double iavg = iobj.average(2, 4, 6, 8, 10);
		System.out.println("Average of Integers" + iavg);

	}

}
