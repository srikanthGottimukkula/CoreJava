package consumer;

import java.util.function.Consumer;

class MovieList {
	String name;
	String result;

	public MovieList(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}

}

public class ConsumerChaining {
	public static void main(String[] args) {

		MovieList movie = new MovieList("Billa", "Hit");
		MovieList movie1 = new MovieList("Mirchi", "BlockBuster");

		Consumer<MovieList> c1 = m -> System.out.println("The movie name is :" + m.name);
		Consumer<MovieList> c2 = m -> System.out
				.println("The movie name is :" + m.name + "The Movie result is:" + m.result);
		Consumer<MovieList> c3 = m -> System.out.println("The movie name is :" + m.name + "good movie !!");

		Consumer<MovieList> chained = c1.andThen(c2).andThen(c3);
		chained.accept(movie1);

	}
}
