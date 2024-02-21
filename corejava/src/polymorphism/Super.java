package polymorphism;

class A {
	int i=10; //non static varailble or instance varaible
	void show() {
		System.out.println(i);
	}
	
}

class B extends A {
	int i =6;
	
	void show() {
		System.out.println(i);
	}
	void run(){
		
	}
}


public class Super {
public static void main(String[] args) {
	B book = new B();
	book.show();
	
	
}
}
