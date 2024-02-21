package polymorphism;

class Book {

	public void bookName() {
		System.out.println("the bookName is java!!");
	}
}

class Java extends Book {
	public void Subject() {
		System.out.println("java is Object oriented!!");
	}
}

public class BooksDownAndUp {
	public static void main(String[] args) {
		Java j = new Java();	//upCasting
		j.bookName();

		Book b = new Java();
		Java jv = (Java) b;
		jv.Subject();			//downCasting

	}

}
