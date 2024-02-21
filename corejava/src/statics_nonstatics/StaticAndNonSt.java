package statics_nonstatics;

public class StaticAndNonSt {

	static int i;
	int j;

	static {
		StaticAndNonSt s = new StaticAndNonSt();
		System.out.println("inside the satic block !!");
		System.out.println(s);
	}

	{
		System.out.println("non static block !!");
		System.out.println(j = 1);
		System.out.println(this.j = 1);

	}

	public static void show() {
		System.out.println(" inside static method !!");

	}

	public void display() {
		System.out.println("inside non-static method !!");
	}

	public static void main(String[] args) {
		System.out.println("inside the main method !!");
		StaticAndNonSt s1 = new StaticAndNonSt();
		System.out.println(StaticAndNonSt.i = 4);
		System.out.println(s1);
		s1.display();
		StaticAndNonSt.show();

	}

}
