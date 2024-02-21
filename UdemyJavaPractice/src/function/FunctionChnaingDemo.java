package function;

import java.util.function.Function;

public class FunctionChnaingDemo {
	public static void main(String[] args) {

		Function<String,String> f1 = s->s.toLowerCase();
		Function<String,String> f2 = s->s.substring(0,9);
		
		System.out.println("The f1 function result:"+f1.apply("SrikanthGottimukkula"));
		System.out.println("The f2 function result:"+f2.apply("SrikanthGottimukkula"));
		System.out.println("The f1 and f2 function result:"+f1.andThen(f2).apply("SrikanthGottimukkula"));
		System.out.println("The f1 and f2 function result:"+f1.compose(f2).apply("SrikanthGottimukkula"));
		
	
	}
}
