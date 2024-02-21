package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie {
	String name;
	String hero;
	String heroine;

	public Movie(String name, String hero, String heroine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}

}

public class MovieConsumer {
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		populate(list);

		Consumer<Movie> c = m -> {
			System.out.println("The Movie name is:  " + m.name);
			System.out.println("The Movie Hero name is:  " + m.hero);
			System.out.println("The Movie Heroine name is:  " + m.heroine);
			System.out.println("                                        ");
		};

		for (Movie m : list) {
			c.accept(m);
		}

	}

	public static void populate(ArrayList<Movie> m) {
		m.add(new Movie("mirchi", "prabhas", "anushka"));
		m.add(new Movie("varsham", "prabhas", "thrisha"));
		m.add(new Movie("billa", "prabhas", "anushka"));
		m.add(new Movie("bahubali", "prabhas", "anushka"));

	}
}
