package polymorphism;

//super is used to refer immediate parent class instance variable.
//super can be used to invoke parent class method
//super is used to invoke parent class constructor.
class Animal {
	String color = "blue";

	Animal() {
		System.out.println("parent constructor");
	}

	public void eat() {
		System.out.println("animal was eating now!! parent class method invoking");
	}

}

class Dog extends Animal {
	String color = "white";

	Dog() {
		super();
		System.out.println("Dog is Created !!");
	}

	public void Color() {
		System.out.println(color);//white
		System.out.println(super.color);//blue
	}

	public void eat() {
		System.out.println("Dog was eating now!!");
	}

	public void eating() {
		super.eat();

	}

}

public class SuperKeyword {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.Color();
		d.eating();
	

	}

}
