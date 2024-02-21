package inheritance;

class Human {

	public void eat() {
		System.out.println("human is eating!!");
	}
}

class Men extends Human {

	public void sleep() {
		System.out.println("men is sleeping");
	}
}

class Women extends Human {
	public void cooking() {
		System.out.println("women is cooking food!!");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		Women wm = new Women();
		wm.cooking();
		wm.eat();
	}

}
