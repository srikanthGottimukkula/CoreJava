package lambdaExpressions;

import java.util.*;

public class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList();
		books.add(new Book(1, "coreJava", 1200));
		books.add(new Book(2, "advancedJava", 100));
		books.add(new Book(3, "hibernate", 200));
		books.add(new Book(4, "spring", 300));
		books.add(new Book(5, "springboot", 400));
		return books;

	}

}
