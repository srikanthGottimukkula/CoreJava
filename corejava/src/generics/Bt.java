package generics;

class AverageNumb<T extends Number> {

	public double average(T... numbers) {
		double sum = 0;
		for (T t : numbers) {
			sum += t.doubleValue();
		}
		return sum / numbers.length;

	}
}

public class Bt {

	public static void main(String[] args) {

		AverageNumb<Integer> iavg = new AverageNumb<Integer>();
		double davg = iavg.average(2, 4, 6, 8, 14);
		System.out.println(davg);
	}

}
