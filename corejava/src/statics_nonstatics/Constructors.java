package statics_nonstatics;

public class Constructors {

	public int i;
	public int j;

	Constructors() {

		System.out.println("default constructor!!");
	}

	public Constructors(int i, int j) {

		this.i = i;
		this.j = j;
	}

	public int result() {
		return (i + j);
	}

	public void show() {
		System.out.println("non static method!!");

	}

	public static void main(String[] args) {
		Constructors c = new Constructors();
		c.show();
		Constructors c1 = new Constructors(2, 5);
		int s = c1.result();
		System.out.println(s);

	}

}
