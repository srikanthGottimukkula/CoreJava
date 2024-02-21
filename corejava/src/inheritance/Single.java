package inheritance;
//class to class extends and interface to interface extends but interface to class implements
class Animal {

	public void bark() {
		System.out.println("animal is barking!!");
	}

}

class Dog extends Animal {

	public void eat() {
		System.out.println("dog is eating!!");
	}
}

public class Single {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}

}
