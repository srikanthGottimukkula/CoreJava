package polymorphism;

class House {

	public void bark() {
		System.out.println("animal was barking!!");
	}
}

class Lion extends House {
	int i = 10;

	public void sleep() {
		System.out.println("lion is sleeping !!");
	}
}

public class DownCasting {

	public static void main(String[] args) {
		House a = new Lion();
		Lion l = (Lion) a; //down-casting
		
		l.sleep();

	}

}
