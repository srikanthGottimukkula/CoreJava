package statics_nonstatics;

public class StaticDemo {
	static int i; //static variables 
	
	static {
		System.out.println("inside the static block!!");
	}
	static void display() {
		System.out.println("inside the static method!!");
	}
	public static void main(String[] args) {
		System.out.println("inside main method!!");
		System.out.println(StaticDemo.i=10);
		StaticDemo.display();	
	}
}
