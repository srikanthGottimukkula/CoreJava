package abstraction;

interface laptop {
	void features();
}

interface hp {
	void working();
}

class Dell implements laptop, hp {

	public void working() {

		System.out.println("dell is working!!");
	}

	public void features() {
		System.out.println("laptop is working!!");

	}

}

public class MultipleInheritance {

	public static void main(String[] args) {

		Dell d = new Dell();
		d.features();
		d.working();

	}

}
