package inheritance;
//one super class and sub classes extends
//super->sub<->sub

class Mobile {
	public void display() {
		System.out.println("display is on");
	}
}

class Moto extends Mobile {
	public void playing() {
		System.out.println("moto music playing!!");
	}

}

class Realme extends Moto {
	public void showing() {
		System.out.println("Realme is showing!!");
	}

}

public class Multilevel {

	public static void main(String[] args) {
		Realme  realme = new Realme();
		realme.display();
		realme.playing();
		realme.showing();
	}

}
