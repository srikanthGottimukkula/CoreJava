package polymorphism;
//sub -class method name same as the parent class is know as methodOverRiding

class Flowers {

	public void smell() {
		System.out.println("flowers smell is so beautiful!!");
	}
}

class Rose extends Flowers {
	public void smell() {
		System.out.println("Rose flower smell is so nice!!");
	}
}

public class methodOverRiding {

	public static void main(String[] args) {
		System.out.println("main method!!");
		Rose rose = new Rose();
		rose.smell();
	}

}
